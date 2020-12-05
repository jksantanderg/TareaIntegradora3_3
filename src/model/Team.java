package model;

public class Team {
	public final static int PLAYERS = 25;
	public final static int TECHNICAL = 3;
	
	private String nameTeam;
	private HeadCoach headcoach;
	private TechnicalCoach[] technicalCoachTeam;
	private Players[] playersTeam;
	private Lineups lineups;;
	
	// PLAYERS 25, COACH1, TECNI3
	
	/**
	 * @param nameTeam
	 * @param headcoach
	 * @param technicalCoach
	 * @param players
	 * @param lineups
	 */
	public Team(String nameTeam, HeadCoach headcoach, TechnicalCoach[] technicalCoach, Players[] players,
			Lineups lineups) {
		super();
		this.nameTeam = nameTeam;
		this.headcoach = headcoach;
		technicalCoachTeam = new TechnicalCoach [TECHNICAL];
		playersTeam = new Players [PLAYERS];
		this.lineups = lineups;
	}

	/**
	 * @return the nameTeam
	 */
	public String getNameTeam() {
		return nameTeam;
	}

	/**
	 * @param nameTeam the nameTeam to set
	 */
	public void setNameTeam(String nameTeam) {
		this.nameTeam = nameTeam;
	}

	/**
	 * @return the head coach
	 */
	public HeadCoach getHeadcoach() {
		return headcoach;
	}

	/**
	 * @param headcoach the head coach to set
	 */
	public void setHeadcoach(HeadCoach headcoach) {
		this.headcoach = headcoach;
	}

	/**
	 * @return the technicalCoachTeam
	 */
	public TechnicalCoach[] getTechnicalCoachTeam() {
		return technicalCoachTeam;
	}

	/**
	 * @param technicalCoachTeam the technicalCoachTeam to set
	 */
	public void setTechnicalCoachTeam(TechnicalCoach[] technicalCoachTeam) {
		this.technicalCoachTeam = technicalCoachTeam;
	}

	/**
	 * @return the playersTeam
	 */
	public Players[] getPlayersTeam() {
		return playersTeam;
	}

	/**
	 * @param playersTeam the playersTeam to set
	 */
	public void setPlayersTeam(Players[] playersTeam) {
		this.playersTeam = playersTeam;
	}

	/**
	 * @return emun
	 */
	public Lineups getLineups() {
		return lineups;
	}

	/**
	 * @param emun
	 */
	public void setLineups(Lineups lineups) {
		this.lineups = lineups;
	}

	/**
	 * @return the players
	 */
	public static int getPlayers() {
		return PLAYERS;
	}

	/**
	 * @return the technical
	 */
	public static int getTechnical() {
		return TECHNICAL;
	}
	
}
		
