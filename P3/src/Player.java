



/**
 * This Class creates a player for the game
 * @author Gustavo
 *
 */
public class Player {
	private String username;
	private String password;
	private int timesWon;
	private int timesLost;
	private int timesDraw;
	private int accumulatedPoints;


	/**
	 * Constructs a player with a given username
	 */
	public Player(String username){
		this.username = username;

	}

	/**
	 * Sets a new username to a player
	 * @param username String of the desired name to give to a player
	 */
	public void setUsername(String username){
		this.username = username;
	}

	/**
	 * Returns the username of a desired player
	 * @return String representation of the username of a desired player
	 */
	public String getUsername(){
		return username;

	}

	/**
	 * Sets a new password to a player
	 * @param password String of the desired password to give to a player
	 */
	public void setPassword(String password){
		this.password = password;
	}

	/**
	 * Returns the password of a desired player
	 * @return String representation of the password of a desired player
	 */
	public String getPassword(){
		return this.password;

	}

	/**
	 * Sets the value of the times a player has won a game
	 * @param timesWon Integer value of the times a player has won a game
	 */
	public void setTimesWon(int timesWon){
		this.timesWon = timesWon;
	}

	/**
	 * Returns the times a player has won a game
	 * @return Integer representation of the times a player has won a game
	 */
	public int getTimesWon(){
		return this.timesWon;

	}

	/**
	 * Set the value of times a player has lost a game
	 * @param timesLost Integer representation of the times a player has lost a game
	 */
	public void setTimesLost(int timesLost){
		this.timesLost = timesLost;
	}

	/**
	 * Returns the times a player has lost a game
	 * @return Integer representation of the times a player has lost a game
	 */
	public int getTimesLost(){
		return this.timesLost;

	}

	/**
	 * Set the value of times a player has gotten a draw in a game
	 * @param timesDraw Integer representation of the times a player has gotten a draw in a game
	 */
	public void setTimesDraw(int timesDraw){
		this.timesDraw = timesDraw;
	}

	/**
	 * Returns the times a player has gotten a draw in a game
	 * @return Integer representation of the times a player has gotten a draw in a game
	 */
	public int getTimesDraw(){
		return this.timesDraw;

	}

	/**
	 * Set the value of the accumulated points a player has gotten his games
	 * @param accumulatedPoints Integer representation of the value of the accumulated points a player has gotten his games
	 */
	public void setAccumulatedPoints(int accumulatedPoints){
		this.accumulatedPoints = accumulatedPoints;
	}


	/**
	 * Returns the value of the accumulated points a player has gotten his games
	 * @return Integer representation of the value of the accumulated points a player has gotten his games
	 */
	public int getAccumulatedPoints(){
		return this.accumulatedPoints;

	}


	


}
