package model;

public class Team {
	private String nameTeam;
	private String headCoach;
	public static final int TECHNICAL_COACH = 3;
	public static final int PLAYERS = 25;
	public static final int LINEUPS = 1;
	/*private String[] technicalCoach;
	private String[] players;
	private int[] lineups;*/
	
	public Team(String nameTeam, String headCoach, String[] technicalCoach, String[] players, int[] lineups) {
		super();
		this.nameTeam = nameTeam;
		this.headCoach = headCoach;
		/*this.technicalCoach = technicalCoach;
		this.players = players;
		this.lineups = lineups;*/
	}

	public String getNameTeam() {
		return nameTeam;
	}

	public void setNameTeam(String nameTeam) {
		this.nameTeam = nameTeam;
	}

	public String getHeadCoach() {
		return headCoach;
	}

	public void setHeadCoach(String headCoach) {
		this.headCoach = headCoach;
	}

}
