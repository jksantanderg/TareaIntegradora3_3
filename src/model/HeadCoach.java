package model;

public class HeadCoach extends Coach{
	private int equipment;
	private int championships;
	
	public HeadCoach(String nameEmployees, String id, String salary, String state, String yearsExperience,
			int equipment, int championships) {
		super(nameEmployees, id, salary, state, yearsExperience);
		this.equipment = equipment;
		this.championships = championships;
	}

	public int getEquipment() {
		return equipment;
	}

	public void setEquipment(int equipment) {
		this.equipment = equipment;
	}

	public int getChampionships() {
		return championships;
	}

	public void setChampionships(int championships) {
		this.championships = championships;
	}
	
	public void calculateCoachPrice() {
		
	}
	
	public void calculateCoachLevelStars() {
		
	}

}
