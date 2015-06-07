import java.awt.Graphics;

/**
 * Creates the static ball object
 * @author Gustavo
 *
 */
public class StaticBall extends Ball {

	boolean collisioned;
/**
 * Constructor a static ball
 * @param color
 * @param x
 * @param y
 */
	public StaticBall(String color, int x, int y) {
		super(color, x, y);
		this.collisioned = false;
	}
	/**
	 * Draws static ball
	 * @param g
	 */
	public void paintComponent(Graphics g){
		
	}
/**
 * Checks if the ball has been hit.
 * @return boolean
 */
	public boolean isCollisioned() {
		return collisioned;
	}
/**
 * Sets the ball collision
 * @param collisioned
 */
	public void setCollisioned(boolean collisioned) {
		this.collisioned = collisioned;
	}
}
