package ui;

//import model.*;
import java.util.Scanner;

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
	//this.users = createUser();
			break;
		case FIRE_EMPLOYEESS:
	//System.out.println(users.showUser());
			break;
		case UPDATE_INFO:
			
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
	//String nameEmployees, String id, String salary, String state, String shirtNumber, int goals,
	public void hirePlayer() {
		System.out.println("CREATE PLAYER\n");
		System.out.println("Enter name player");
		String nameEmployees = sc.next();
		System.out.println("Enter id ");
		String pasword = sc.next();
		System.out.println("Enter the user's age: ");
		int age = sc.nextInt();
		CategoryUser category = CategoryUser.newbie;
		
		Users users = new Users (name,pasword,age,category);
		return users;
	}
}
