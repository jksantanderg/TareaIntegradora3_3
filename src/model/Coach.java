package model;

public class Coach extends Employees{
	private String yearsExperience;

	public Coach(String nameEmployees, String id, String salary, String state, String yearsExperience) {
		super(nameEmployees, id, salary, state);
		this.yearsExperience = yearsExperience;
	}

	public String getYearsExperience() {
		return yearsExperience;
	}

	public void setYearsExperience(String yearsExperience) {
		this.yearsExperience = yearsExperience;
	}
	
}
