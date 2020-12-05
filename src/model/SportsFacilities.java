package model;

public class SportsFacilities {
	private Coach [][] offices;
	private Players [] [] dressing1;
	private Players [] [] dressing2;
	
	/**
	 * @param offices
	 * @param dressing1
	 * @param dressing2
	 */
	public SportsFacilities(Coach[][] offices, Players[][] dressing1, Players[][] dressing2) {
		super();
		offices = new Coach[6][6];
		dressing1 = new Players [7][6];
		dressing2 = new Players [7][7];
	}

	/**
	 * @return the offices
	 */
	public Coach[][] getOffices() {
		return offices;
	}

	/**
	 * @param offices the offices to set
	 */
	public void setOffices(Coach[][] offices) {
		this.offices = offices;
	}

	/**
	 * @return the dressing1
	 */
	public Players[][] getDressing1() {
		return dressing1;
	}

	/**
	 * @param dressing1 the dressing1 to set
	 */
	public void setDressing1(Players[][] dressing1) {
		this.dressing1 = dressing1;
	}

	/**
	 * @return the dressing2
	 */
	public Players[][] getDressing2() {
		return dressing2;
	}

	/**
	 * @param dressing2 the dressing2 to set
	 */
	public void setDressing2(Players[][] dressing2) {
		this.dressing2 = dressing2;
	}
	
}
