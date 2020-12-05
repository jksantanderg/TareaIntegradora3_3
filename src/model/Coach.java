package model;

public class Coach extends Employees{
	private String yearsExperience;

	
	/**
	 * @param nameEmployees
	 * @param id
	 * @param salary
	 * @param state
	 * @param yearsExperience
	 */
	public Coach(String nameEmployees, String id, String salary, String state, String yearsExperience) {
		super(nameEmployees, id, salary, state);
		this.yearsExperience = yearsExperience;
	}


	/**
	 * @return the yearsExperience
	 */
	public String getYearsExperience() {
		return yearsExperience;
	}


	/**
	 * @param yearsExperience the yearsExperience to set
	 */
	public void setYearsExperience(String yearsExperience) {
		this.yearsExperience = yearsExperience;
	}

}
