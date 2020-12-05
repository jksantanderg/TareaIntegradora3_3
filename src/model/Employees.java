package model;

public class Employees {
	private String nameEmployees;
	private String id;
	private String salary;
	private String state;
		
	/**
	 * @param nameEmployees
	 * @param id
	 * @param salary
	 * @param state
	 */
	public Employees(String nameEmployees, String id, String salary, String state) {
		super();
		this.nameEmployees = nameEmployees;
		this.id = id;
		this.salary = salary;
		this.state = state;
	}

	/**
	 * @return the nameEmployees
	 */
	public String getNameEmployees() {
		return nameEmployees;
	}

	/**
	 * @param nameEmployees the nameEmployees to set
	 */
	public void setNameEmployees(String nameEmployees) {
		this.nameEmployees = nameEmployees;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the salary
	 */
	public String getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(String salary) {
		this.salary = salary;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	
}
