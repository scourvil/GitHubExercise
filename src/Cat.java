import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.*;

public class Cat {
	// drawing constants are private - noone needs to know what we're doing
	// pick a head dimension
	private static final int HEAD_DIMENSION = 100;
	// eyes will be about 1/4 from top of head and 1/4 from left
	private static final int EYE_Y = HEAD_DIMENSION/4;
	private static final int EYE_X = HEAD_DIMENSION/4;
	private static final int EYE_SEPARATION = HEAD_DIMENSION/3;
	// pick eye dimensions
	private static final int EYE_HEIGHT = 20;
	private static final int EYE_WIDTH = 10;
	// pick mouth height, width is based on head dimension
	private static final int MOUTH_HEIGHT = 10;
	private static final int MOUTH_WIDTH = HEAD_DIMENSION/4;
	// mouth starts about 40% from left edge of head
	private static final int MOUTH_X = HEAD_DIMENSION/5 * 2;
	private static final int MOUTH_Y = HEAD_DIMENSION/5 * 3;
	// ear coordinates
	private static final int EAR_X1 = 8;
	private static final int EAR_X2 = 24;
	private static final int EAR_X3 = 8;
	private static final int EAR_Y1 = 8;
	private static final int EAR_Y2 = 8;
	private static final int EAR_Y3 = 24;
	
	private static final int EAR_X4 = 50;
	private static final int EAR_X5 = 66;
	private static final int EAR_X6 = 50;
	private static final int EAR_Y4 = 50;
	private static final int EAR_Y5 = 50;
	private static final int EAR_Y6 = 66;
	
	// draw will render the Cat on the Graphics object
	public void draw(Graphics g, int catX, int catY)
	{
		Graphics2D g2 = (Graphics2D) g;
		int x=catX;
		int y=catY;
		// Draw the head
		g2.setColor(Color.blue);
		g2.fillOval(x, y, HEAD_DIMENSION, HEAD_DIMENSION);
		// Draw the eyes
		g2.setColor(Color.black);
		x = catX + EYE_X; 
		y = catY + EYE_Y;
		g2.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
		x += EYE_SEPARATION;
		g2.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
		// Draw the mouth
		g2.setColor(Color.red);
		x = catX + MOUTH_X;
		y = catY + MOUTH_Y;
		g2.fillOval(x, y, MOUTH_WIDTH, MOUTH_HEIGHT);
		g2.setColor(Color.black);
		// Draw Ears
		g2.setColor(Color.black);
		Polygon ear = new Polygon();
		ear.addPoint(catX + EAR_X1, catY + EAR_Y1);
		ear.addPoint(catX + EAR_X2, catY + EAR_Y2);
		ear.addPoint(catX + EAR_X3, catY + EAR_Y3);
		g2.fillPolygon(ear);
		g2.setColor(Color.black);
		Polygon ear2 = new Polygon();
		ear2.addPoint(catX + EAR_X1+ 90, catY + EAR_Y1);
		ear2.addPoint(catX + EAR_X2 + 50, catY + EAR_Y2 );
		ear2.addPoint(catX + EAR_X3 + 80, catY + EAR_Y3 );
		g2.fillPolygon(ear2);
		// Meow text appears below cat head, +10 places below 
		// so it doesn't overlap the drawing
		g2.drawString("Meow", catX, catY+HEAD_DIMENSION+10);	
	}
}
