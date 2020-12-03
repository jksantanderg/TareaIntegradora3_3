package model;

public class SportClub {
	private String name;
	private String nit;
	private String foundationDate;
	
	public SportClub(String name, String nit, String foundationDate) {
		super();
		this.name = name;
		this.nit = nit;
		this.foundationDate = foundationDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getFoundationDate() {
		return foundationDate;
	}

	public void setFoundationDate(String foundationDate) {
		this.foundationDate = foundationDate;
	}
}
