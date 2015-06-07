/**
 * Creates a Ball
 * @author Gustavo
 *
 */
public class Ball {
	
	private String color;
	private int diameter;
	private int x, y;
	/**
	 * Ball Constructor
	 * @param color
	 * @param x
	 * @param y
	 */
	public Ball(String color, int x, int y) {
		super();
		this.color = color;
		this.diameter = 20;
		this.x = x;
		this.y = y;
	}
	
/**
 * Returns X coordinate
 * @return x
 */
	public int getX() {
		return x;
	}
	/**
	 * Sets X coordinate
	 * @return void
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * Returns Y coordinate
	 * @return Y
	 */
	public int getY() {
		return y;
	}
	/**
	 * Sets y coordinate
	 * @return void
	 */
	public void setY(int y) {
		this.y = y;
	}
	/**
	 * Returns ball color
	 * @return
	 */
	public String getColor() {
		return color;
	}
	/**
	 * Returns ball diamater
	 * @return
	 */
	public int getDiameter() {
		return diameter;
	}
	
	
	
}
