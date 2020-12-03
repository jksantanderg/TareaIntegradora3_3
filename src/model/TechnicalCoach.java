package model;

public class TechnicalCoach extends Coach{
	private boolean player;
	private Expertise expertise;
	
	public TechnicalCoach(String nameEmployees, String id, String salary, String state, String yearsExperience,
			boolean player, Expertise expertise) {
		super(nameEmployees, id, salary, state, yearsExperience);
		this.player = player;
		this.expertise = expertise;
	}

	public boolean isPlayer() {
		return player;
	}

	public void setPlayer(boolean player) {
		this.player = player;
	}

	public Expertise getExpertise() {
		return expertise;
	}

	public void setExpertise(Expertise expertise) {
		this.expertise = expertise;
	}

}
