package model;

public class Team {
	public final static int PLAYERS = 25;
	public final static int TECHNICAL = 3;
	
	private String nameTeam;
	private HeadCoach headcoach;
	private TechnicalCoach[] technicalCoach;
	private Players[] players;
	private Lineups lineups;;
	
	// PLAYERS 25, COACH1, TECNI3, lineups
	
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
		technicalCoach = new TechnicalCoach [TECHNICAL];
		players = new Players [PLAYERS];
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
	 * @return the technicalCoach
	 */
	public TechnicalCoach[] getTechnicalCoach() {
		return technicalCoach;
	}


	/**
	 * @param technicalCoach the technicalCoach to set
	 */
	public void setTechnicalCoach(TechnicalCoach[] technicalCoach) {
		this.technicalCoach = technicalCoach;
	}


	/**
	 * @return the players
	 */
	public Players[] getPlayers() {
		return players;
	}


	/**
	 * @param players the players to set
	 */
	public void setPlayers(Players[] players) {
		this.players = players;
	}


	/**
	 * @return a object
	 */
	public Lineups getLineups() {
		return lineups;
	}


	/**
	 * @param lineups 
	 */
	public void setLineups(Lineups lineups) {
		this.lineups = lineups;
	}


	/**
	 * @return the technical
	 */
	public static int getTechnical() {
		return TECHNICAL;
	}	
	
}
		
