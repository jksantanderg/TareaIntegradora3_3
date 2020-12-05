package model;

import java.util.ArrayList;

public class SportClub {
	private String name;
	private String nit;
	private String foundationDate;
	private ArrayList<Employees> listemployees;
	private Team teamA;
	private Team teamB;
	private SportsFacilities sportfacilities;
	private Employees technicalcoach;
	private Employees headcoach;
	private Employees players;
	
	//EMPLOYESS.. TEAM 2, offices 36 (6x6), dress1 42(7x6) y dess2 49 (7x7). 


	public String getName() {
		return name;
	}

	/**
	 * @param name
	 * @param nit
	 * @param foundationDate
	 * @param listemployees
	 * @param teamA
	 * @param teamB
	 * @param sportfacilities
	 * @param employees
	 */
	public SportClub(String name, String nit, String foundationDate, ArrayList<Employees> listemployees, Team teamA,
			Team teamB, SportsFacilities sportfacilities, Employees employees) {
		super();
		this.name = name;
		this.nit = nit;
		this.foundationDate = foundationDate;
		this.listemployees = listemployees;
		this.teamA = teamA;
		this.teamB = teamB;
		this.sportfacilities = sportfacilities;
		listemployees = new ArrayList<Employees>();
	}

	
	
	/**
	 * @return the nit
	 */
	public String getNit() {
		return nit;
	}

	/**
	 * @param nit the nit to set
	 */
	public void setNit(String nit) {
		this.nit = nit;
	}

	/**
	 * @return the foundationDate
	 */
	public String getFoundationDate() {
		return foundationDate;
	}

	/**
	 * @param foundationDate the foundationDate to set
	 */
	public void setFoundationDate(String foundationDate) {
		this.foundationDate = foundationDate;
	}

	/**
	 * @return the list employees
	 */
	public ArrayList<Employees> getListemployees() {
		return listemployees;
	}

	/**
	 * @param listemployees the list employees to set
	 */
	public void setListemployees(ArrayList<Employees> listemployees) {
		this.listemployees = listemployees;
	}

	/**
	 * @return the teamA
	 */
	public Team getTeamA() {
		return teamA;
	}

	/**
	 * @param teamA the teamA to set
	 */
	public void setTeamA(Team teamA) {
		this.teamA = teamA;
	}

	/**
	 * @return the teamB
	 */
	public Team getTeamB() {
		return teamB;
	}

	/**
	 * @param teamB the teamB to set
	 */
	public void setTeamB(Team teamB) {
		this.teamB = teamB;
	}

	/**
	 * @return the sport facilities
	 */
	public SportsFacilities getSportfacilities() {
		return sportfacilities;
	}

	/**
	 * @param sportfacilities the sport facilities to set
	 */
	public void setSportfacilities(SportsFacilities sportfacilities) {
		this.sportfacilities = sportfacilities;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void creEmployee(String nameEmployees, String id, String salary,String state) {
		System.out.println("CREATE EMPLOYEES\n");
		new Employees(nameEmployees, id, salary, state);		
	}
	
	public void EmployeesPlayer(String nameEmployees, String id, String salary, String state, String shirtNumber, String goals,int qualifiquer, Position position) {
		
		System.out.println("CREATE EMPLOYEES\n");
		new Players(nameEmployees, id, salary, state,shirtNumber, goals, qualifiquer, position);
	
;
		listemployees.add((Employees) players);
	}	
	

	public void EmployeesCoachHead(String nameEmployees, String id, String salary, String state,  String yearsExperience,int equipment, int championships) {
		System.out.println("CREATE EMPLOYEES\n");
		new HeadCoach(nameEmployees, id, salary, state, yearsExperience,equipment,championships);
		
		//Employees headcoach = null;
		listemployees.add((Employees) headcoach);
	}	
	
	public ArrayList<Employees> EmployeesCoachTec(String nameEmployees, String id, String salary, String state,  String yearsExperience,int player, Expertise expertise) {
		System.out.println("CREATE EMPLOYEES\n");
		new TechnicalCoach(nameEmployees, id, salary, state, yearsExperience, player, expertise);
		
		listemployees.add((Employees) technicalcoach);
		return listemployees;
	}
	
	public Team teamA(String nameTeam, HeadCoach headcoach, TechnicalCoach[] technicalCoach, Players[] players,Lineups lineups) {
		
		return teamA("TeamA",headcoach, technicalCoach,players,lineups);
	}
	
	public Team teamB(String nameTeam, HeadCoach headcoach, TechnicalCoach[] technicalCoach, Players[] players,Lineups lineups) {
		
		return teamB("TeamB",headcoach, technicalCoach,players,lineups);
	}
	
}
