package model;

public class HeadCoach extends Coach{
	private int equipment;
	private int championships;
	
	/**
	 * @param nameEmployees
	 * @param id
	 * @param salary
	 * @param state
	 * @param yearsExperience
	 * @param equipment
	 * @param championships
	 */
	public HeadCoach(String nameEmployees, String id, String salary, String state, String yearsExperience,
			int equipment, int championships) {
		super(nameEmployees, id, salary, state, yearsExperience);
		this.equipment = equipment;
		this.championships = championships;
	}

	/**
	 * @return the equipment
	 */
	public int getEquipment() {
		return equipment;
	}

	/**
	 * @param equipment the equipment to set
	 */
	public void setEquipment(int equipment) {
		this.equipment = equipment;
	}

	/**
	 * @return the championships
	 */
	public int getChampionships() {
		return championships;
	}

	/**
	 * @param championships the championships to set
	 */
	public void setChampionships(int championships) {
		this.championships = championships;
	}

}
