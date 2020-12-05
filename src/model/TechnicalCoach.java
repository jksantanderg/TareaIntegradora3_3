package model;

public class TechnicalCoach extends Coach{
	private int player;
	private Expertise expertise;
	
	/**
	 * @param nameEmployees
	 * @param id
	 * @param salary
	 * @param state
	 * @param yearsExperience
	 * @param player
	 * @param expertise
	 */
	public TechnicalCoach(String nameEmployees, String id, String salary, String state, String yearsExperience,
			int player, Expertise expertise) {
		super(nameEmployees, id, salary, state, yearsExperience);
		this.player = player;
		this.expertise = expertise;
	}

	

	/**
	 * @return the player
	 */
	public int getPlayer() {
		return player;
	}



	/**
	 * @param player the player to set
	 */
	public void setPlayer(int player) {
		this.player = player;
	}



	/**
	 * @return the expertise
	 */
	public Expertise getExpertise() {
		return expertise;
	}

	/**
	 * @param expertise the expertise to set
	 */
	public void setExpertise(Expertise expertise) {
		this.expertise = expertise;
	}

}
