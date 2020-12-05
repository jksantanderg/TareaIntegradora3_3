package ui;

import model.*;

//import java.util.ArrayList;
import java.util.Scanner;


//import model.Position;

public class Menu {

	private final static int HIRE_EMPLOYEESS = 1;
	private final static int FIRE_EMPLOYEESS = 2;
	private final static int ADD_EMPLOYEESS_TEAM = 3;
	private final static int UPDATE_INFO = 4;
	private final static int SHOW_INFO = 5;
	private final static int ADD_ALIGNMENT = 6;
	private final static int LOCATE_COACH = 7;
	private final static int LOCATE_PLAYER = 8;
	private final static int SHOW_CLUB = 9;
	private final static int SHOW_LOCATION_COACHES = 10;
	private final static int SHOW_LOCATION_PLAYERS = 11;
	private final static int EXIT = 12;

		
	private static Scanner sc = new Scanner(System.in);
	//private Players players;
		
	public Menu() {
		super();
	}
		
	/**
	*show menu options
	*@param 
	*@return
	*/
	public void showMenu() {
		System.out.println("(" +HIRE_EMPLOYEESS+ ") Hire an employee. (coaches or players)");
		System.out.println("(" +FIRE_EMPLOYEESS+ ") Fire an employee. (coaches or players)");
		System.out.println("(" +ADD_EMPLOYEESS_TEAM+ ") Add players or coaches to teams");
		System.out.println("(" +UPDATE_INFO+ ") Update employee and team information");
		System.out.println("(" +SHOW_INFO+ ") Show employee and team information");
		System.out.println("(" +ADD_ALIGNMENT+ ") Add rosters to the team considering the characteristics");
		System.out.println("(" +LOCATE_COACH+ ") Locate coaches in offices");
		System.out.println("(" +LOCATE_PLAYER+ ") Position the players in the changing rooms");
		System.out.println("(" +SHOW_CLUB+ ") Show club information");
		System.out.println("(" +SHOW_LOCATION_COACHES+ ") Show the location of coaches in their offices");
		System.out.println("(" +SHOW_LOCATION_PLAYERS+ ") show the location of the players in the dressing room");
		System.out.println("(" +EXIT+ ") EXIT");
	}
		
		
	/**
	*read the option that the user chooses from the menu
	*@param 
	*@return enter choice
	*/
	public int readOption() {
		int choice = sc.nextInt();
		return choice;
	}
		
	/**
	*the menu 
	*@param int choice, 
	*@return
	*/	
	public void doOperation(int choice) {
		switch (choice) {
		case HIRE_EMPLOYEESS:
			hireEmployee();
			//this.players = hirePlayer();
			
			break;
		case FIRE_EMPLOYEESS:
			//fireEmployees(null, choice);
			break;
		case UPDATE_INFO:
			AddTeam();
			break;
		case SHOW_INFO:
			
			break;
		case ADD_ALIGNMENT:
			
			break;
		case LOCATE_COACH:
			
			break;
		case LOCATE_PLAYER:
			
			break;
		case SHOW_CLUB:
			
			break;
		case SHOW_LOCATION_COACHES:
			
			break;
		case SHOW_LOCATION_PLAYERS:
	
			break;
		case EXIT:
			break;
		default:
			System.out.println("Option invalid, repeat again");
			
		}
	}
	
	/**
	*invoke several methods, to make the menu work.
	*@param 
	*@return 
	*/
	public void startProgram() {
		int option;
		do {
			showMenu();
			option = readOption();
			doOperation(option);
		}while(option!=15);
	}	
	//String nameEmployees, String id, String salary, String state
	public void hireEmployee() {
		System.out.println("-------------------- ");
		System.out.println("Enter 1. if you want to hire a players ");
		System.out.println("Enter 2. if you want to hire a coach ");
		int type = sc.nextInt();
		
		if(type==1) {
			hirePlayers();
		}else {
			if(type==2) {
				System.out.println("-------------------- ");
				System.out.println("---------HEAD EMPLOYEES----------- ");
				System.out.println("-------------------- ");
				System.out.println("Enter 1. if you want to hire a head coach ");
				System.out.println("Enter 2. if you want to hire a technical coach ");
				int ty = sc.nextInt();
			
				if(ty==1) {
					hireHeadCoach();
				
				}else {
					if(ty==2) {
						technicalCoach();
					}
				}				
			}
		}
		
	}
	
	public Players hirePlayers() {
		System.out.println("CREATE PLAYERS\n");
		System.out.println("Enter the name the employees ");
		String nameEmployees = sc.next();
		System.out.println("Enter the id");
		String id = sc.next();
		System.out.println("Enter the Salary the employees ");
		String salary = sc.next();
		System.out.println("Enter the state ");
		String state = sc.next();
		
		System.out.println("Enter your jersey number ");
		String shirtNumber = sc.next();
		System.out.println("Enter the numbers goals");
		String goals = sc.next();
		System.out.println("Enter the qulifiquer the player ");
		int qualifiquer = sc.nextInt();
		System.out.println("Enter the position the player ");
		Position position = Position.defender;
	
		Players players = new Players(nameEmployees, id, salary, state, shirtNumber, goals, qualifiquer, position);
		return players;
	}
	
	public HeadCoach hireHeadCoach() {
		System.out.println("CREATE PLAYERS\n");
		System.out.println("Enter the name the employees ");
		String nameEmployees = sc.next();
		System.out.println("Enter the id");
		String id = sc.next();
		System.out.println("Enter the Salary the employees ");
		String salary = sc.next();
		System.out.println("Enter the state ");
		String state = sc.next();
		System.out.println("Enter the Enter the years of experience you have as a coach");
		String yearsExperience = sc.next();
		System.out.println("Enter the number of teams you have been in charge ");
		int equipment = sc.nextInt();
		System.out.println("Enter the number of championships you have achieved ");
		int championships = sc.nextInt();
		
		HeadCoach headcoach = new HeadCoach(nameEmployees, id, salary, state,yearsExperience, equipment, championships);
		return headcoach;
	}
	
	
	
	public TechnicalCoach technicalCoach() {
		System.out.println("CREATE HIRE TECHNICAL COACH\n");
		System.out.println("Enter the name the employees ");
		String nameEmployees = sc.next();
		System.out.println("Enter the id");
		String id = sc.next();
		System.out.println("Enter the Salary the employees ");
		String salary = sc.next();
		System.out.println("Enter the state ");
		String state = sc.next();
		System.out.println("Enter the Enter the years of experience you have as a coach");
		String yearsExperience = sc.nextLine();
		System.out.println("Were you a player? .ENTER 1) yes 2) no");
		int player = sc.nextInt();
		System.out.println("Enter the number of teams you have been in charge ");
		Expertise expertise = Expertise.defensive;
		
		TechnicalCoach technicalcoach = new TechnicalCoach(nameEmployees, id, salary, state,yearsExperience, player, expertise);
		return technicalcoach;
	}
	
	
	
	
	//DESPEDIR
	/*public int fire() {
		System.out.println("-----FIRE EMPLOYEES--------------- ");
		System.out.println("Enter the id of the employee you want to fire ");
		int fire = sc.nextInt();
		return fire;
	}
	
	public void fireEmployee() {
		System.out.println("-------------------- ");
		System.out.println("-----FIRE EMPLOYEES--------------- ");
		System.out.println("-------------------- ");
		System.out.println("Enter 1. if you want to fire a players ");
		System.out.println("Enter 2. if you want to fire a coach ");
		int type = sc.nextInt();
		
		if(type==1) {
			
		}else {
			if(type==2) {
				System.out.println("-------------------- ");
				System.out.println("Enter 1. if you want to fire a head coach ");
				System.out.println("Enter 2. if you want to fire a technical coach ");
				int ty = sc.nextInt();
			
				if(ty==1) {
					
				
				}else {
					if(ty==2) {
						
					}
				}				
			}
		}
		
	}

	/*public void fireEmployees(ArrayList<Employees> listemployees,int id) {
		
		int indice = 0;
		System.out.println("Enter the id of the employee you want to fire");
		int valor = sc.nextInt();
		
		//indice = listemployees.indexOf(valor);
		if ( ((Employees) listemployees).getId()==valor){
			listemployees=null;
			System.out.println("The employee has been fired");
		}
		
	}
	

	
	public void addEmployees(ArrayList<Employees> listemployees) {
		
		int ind = 0;	
		System.out.println("Add employees to teams ");
		System.out.println("Enter the id of the employee you want add");
		int valor = sc.nextInt();
		System.out.println("Enter 1. if you want to add players to the team ");
		System.out.println("Enter 2. if you want to add coach to the team ");
		int ty = sc.nextInt();
	
	
	
	}*/
	
	
	//AGREGAR EQUIPO
	
	public void addTeam() {
		System.out.println("-------------------- ");
		System.out.println("-----ADD TEAM--------------- ");
		System.out.println("-------------------- ");
		System.out.println("Enter 1. if you want to add to TeamA ");
		System.out.println("Enter 2. if you want to add to TeamB ");
		int type = sc.nextInt();
		
		if(type==1) {
			
			}else {
			if(type==2) {
				
		
					}
			}				
	}
	

	
	public void AddTeam() {
	
		System.out.println("-------------------- ");
		System.out.println("Enter 1. if you want to add a players ");
		System.out.println("Enter 2. if you want to add a coach ");
		int type = sc.nextInt();
			
		if(type==1 ) {
			hirePlayers();
		}else {
			if(type==2) {
				System.out.println("-------------------- ");
				System.out.println("---------ADD EMPLOYEES----------- ");
				System.out.println("-------------------- ");
				System.out.println("Enter 1. if you want to add a head coach ");
				System.out.println("Enter 2. if you want to add a technical coach ");
				int ty = sc.nextInt();
			
				if(ty==1) {
					
				
				}else {
					if(ty==2) {
						
					}
				}				
			}	
		}
	}
	
	public void addPlayers() {
		
		System.out.println("Enter how many players do you want to join the team ");
		int  var = sc.nextInt();	
		
		if(var<26) {
			for (int i=0; i<25;i++) {
				
			}
				
			System.out.println("ERROR");
			System.out.println("Number Invalido, maximum number allowed 25");
	
		}
	}
	
		

		
	
		
	public void teamm(){
		
		System.out.println("Enter 1. TEAM A ");
		System.out.println("Enter 1. TEAM B ");
		int  tea = sc.nextInt();
		
		if(tea==1) {
			addTeamA();
		}else {
			if(tea==2) {
				addTeamB();
			}
		}
	}
	
	
	public void addTeamA() {
	}
	
	public void addTeamB() {
	
	}
	
}
