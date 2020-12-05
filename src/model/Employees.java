package model;

public class Employees {
	private String nameEmployees;
	private String id;
	private String salary;
	private String state;
	
	public Employees(String nameEmployees, String id, String salary, String state) {
		super();
		this.nameEmployees = nameEmployees;
		this.id = id;
		this.salary = salary;
		this.state = state;
	}

	public String getNameEmployees() {
		return nameEmployees;
	}

	public void setNameEmployees(String nameEmployees) {
		this.nameEmployees = nameEmployees;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
}
