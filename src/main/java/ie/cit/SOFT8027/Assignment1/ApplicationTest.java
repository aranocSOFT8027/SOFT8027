package ie.cit.SOFT8027.Assignment1;

import java.sql.ResultSet;



import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import ie.cit.SOFT8027.Assignment1.domain.Armour;
import ie.cit.SOFT8027.Assignment1.domain.Functions;
import ie.cit.SOFT8027.Assignment1.domain.Menu;
import ie.cit.SOFT8027.Assignment1.domain.Player;
import ie.cit.SOFT8027.Assignment1.domain.Queries;
import ie.cit.SOFT8027.Assignment1.domain.Weapon;
import ie.cit.SOFT8027.Assignment1.rowmappers.PlayerRowMapper;


@SpringBootApplication
public class ApplicationTest implements CommandLineRunner{
	
	public static void main(String[] args) {
		SpringApplication.run(ApplicationTest.class, args);
	}
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	Functions function;
	
	@Autowired
	Menu menus;
	
	@Autowired
	Queries queries;
	
	@Autowired
	Menu intialMenu;
	
	@Override
	public void run(String... arg0) throws Exception {
		
		//functions.buyEquipment(); the code works when called here but not through the case menu
		//upgradeMenu();
		initialMenu();
		//mainMenu();
		//initialMenu();
		//buyEquipment();
		//sellEquipment();
		//upgradeEquipment();
		//Menu menu = new Menu();
		//menu.initialMenu();
		//displayAllWeapons();
		//playerQuery();
		//Functions displayAllWeapons = new Functions();
		//displayAllWeapons.displayAllWeapons();
		//equipmentList();
		//equipmentList1();
		//equipmentList2();
		//equipmentList3();
		//playerQuery();
		//menu.mainMenu();
		//Player player = new Player();
		//Menu menu = new Menu();
		//menu.initialMenu();
		//player.toString();
	}	
	
	public void initialMenu(){
		System.out.println("         WLECOME  TO  . . . . . .  \n");
		System.out.println("    ---  KYLAR'S  VENGEANCE ---\n");
		System.out.println("*** enter 'play' to start game  ****\n");
		//System.out.println(" If you dont't have one enterthe key word 'new'\n");
		
		
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		do {
			switch (choice){
			case "play":
				//need to add code to search for user ID and display it with the main menu
				//Menu menu = new Menu();
				mainMenu();
				break;
			case "Exit":
				return;
			}
		}while (choice != "Exit");
	}
	
	public void mainMenu(){
		
		//ApplicationTest test = new ApplicationTest();
			//queries.playerQuery();
			//Functions function = new Functions();
			System.out.println(" ---  KYLAR'S  VENGEANCE ---");
			
			System.out.println("   Main  Menu   ");
			System.out.println("1. Finish Round");
			System.out.println("2. Buy new equipment");
			System.out.println("3  Sell equipment");
			System.out.println("4. Upgrade equipment");
			System.out.println("5. Player info ");
			System.out.println("  Help ");
			System.out.println("  Exit ");
			
			Scanner scan = new Scanner(System.in);
			String choice = scan.nextLine();
			do {
				switch (choice){
				case "1":
					System.out.println("choice 1");
					break;
				case "2":
					function.buyEquipment();
					break;
				case "3":
					function.sellEquipment();
					break;
				case "4":
					System.out.println("\n Upgrade menu \n");
					function.upgradeEquipment();
					//upgradeMenu();
					break;
				case "5":
					queries.playerQuery();
					mainMenu();
					break;
				case "Exit":
					initialMenu();
				case "Help":

					System.out.println("     When inputting selections keep an eye on the case of the displayed words" );
					System.out.println("   sometimes you will need to have a capital for the first word of the selection   ");
					System.out.println("  but if you are reading the instruction on screen you should be able to realise");
					System.out.println("                  when you need lowercase or uppercase letters\n");
					System.out.println("                   ^^^^                    ^^^^  ");					
					System.out.println("                    (\")                     (\")  \n");
					System.out.println("  	 	                 ''  ");
					System.out.println("  		        \\                 /  ");
					System.out.println("  		         \\_______________/	     ");
					System.out.println("  		          \\_____________/	     ");
					System.out.println("  		           \\___________/	     \n");
					System.out.println(" Exit \n");
					mainMenu();
					break;				
				}
			} while (choice != "6");
		}
		
	
}
