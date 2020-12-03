package model;

public class Players extends Employees{
	private String shirtNumber;
	private int goals;
	private int qualifiquer;
	private Position position;
	
	
	public Players(String nameEmployees, String id, String salary, String state, String shirtNumber, int goals,
			int qualifiquer, Position position) {
		super(nameEmployees, id, salary, state);
		this.shirtNumber = shirtNumber;
		this.goals = goals;
		this.qualifiquer = qualifiquer;
		this.position = position;
	}

	public String getShirtNumber() {
		return shirtNumber;
	}

	public void setShirtNumber(String shirtNumber) {
		this.shirtNumber = shirtNumber;
	}

	public int getGoals() {
		return goals;
	}

	public void setGoals(int goals) {
		this.goals = goals;
	}

	public int getQualifiquer() {
		return qualifiquer;
	}

	public void setQualifiquer(int qualifiquer) {
		this.qualifiquer = qualifiquer;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
	
	/*private void calculatePlayerPrice() {
		
	}
	private void calculatePlayerLevelStars() {
		
	}*/

}
