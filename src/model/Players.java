package model;

public class Players extends Employees{
	private String shirtNumber;
	private String goals;
	private int qualifiquer;
	private Position position;
	
	/**
	 * @param nameEmployees
	 * @param id
	 * @param salary
	 * @param state
	 * @param shirtNumber
	 * @param goals
	 * @param qualifiquer
	 * @param position
	 */
	public Players(String nameEmployees, String id, String salary, String state, String shirtNumber, String goals,
			int qualifiquer, Position position) {
		super(nameEmployees, id, salary, state);
		this.shirtNumber = shirtNumber;
		this.goals = goals;
		this.qualifiquer = qualifiquer;
		this.position = position;
	}


	/**
	 * @return the shirtNumber
	 */
	public String getShirtNumber() {
		return shirtNumber;
	}


	/**
	 * @param shirtNumber the shirtNumber to set
	 */
	public void setShirtNumber(String shirtNumber) {
		this.shirtNumber = shirtNumber;
	}


	


	/**
	 * @return the goals
	 */
	public String getGoals() {
		return goals;
	}


	/**
	 * @param goals the goals to set
	 */
	public void setGoals(String goals) {
		this.goals = goals;
	}


	/**
	 * @return the qualifiquer
	 */
	public int getQualifiquer() {
		return qualifiquer;
	}


	/**
	 * @param qualifiquer
	 */
	public void setQualifiquer(int qualifiquer) {
		this.qualifiquer = qualifiquer;
	}


	/**
	 * @return the position
	 */
	public Position getPosition() {
		return position;
	}


	/**
	 * @param position the position to set
	 */
	public void setPosition(Position position) {
		this.position = position;
	}

	
	
	/*private void calculatePlayerPrice() {
		
	}
	private void calculatePlayerLevelStars() {
		
	}*/

}
