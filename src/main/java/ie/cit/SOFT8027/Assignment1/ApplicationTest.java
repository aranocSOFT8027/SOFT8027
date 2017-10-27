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
import ie.cit.SOFT8027.Assignment1.domain.TheGame;
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
	
	@Autowired
	TheGame theGame;
	
	@Override
	public void run(String... arg0) throws Exception {
		
		initialMenu();
	}	
	
	public void initialMenu(){
		String coinSackQuery = "SELECT coinSack FROM players WHERE id = 1";
		
		List<Map<String, Object>> resultSet2 = jdbcTemplate.queryForList(coinSackQuery);
		for (Map<String, Object> row : resultSet2) {
			Object coinSack1 = row.get("coinSack");
			int coinSackInt = (int) coinSack1;
		
		if (coinSackInt >= 1){
		System.out.println("         WLECOME  TO  . . . . . .  \n");
		System.out.println("    ---  KYLAR'S  VENGEANCE ---\n");
		System.out.println("*** enter 'play' to start game  ****\n");
		
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		do {
			switch (choice){
			case "play":
				theGame.theGame();
				//mainMenu();
				break;
			case "Exit":
				System.exit(0);
				break;
			}
		}while (choice != "Exit");
		} else { 
			System.out.println("\n   ************************************************ \n");
			System.out.println("                       YOU LOSE");
			System.out.println("\n   ************************************************ \n");
			System.exit(0);
			}
		}
		
	}
	
	public void mainMenu(){

			System.out.println(" ---  KYLAR'S  VENGEANCE ---");
			
			System.out.println("   Main  Menu   ");
			System.out.println("1. Play a round");
			System.out.println("2. Buy new equipment");
			System.out.println("3  Sell equipment");
			System.out.println("4. Upgrade equipment");
			System.out.println("5. Player info ");
			System.out.println("  'Help' ");
			System.out.println("  'Exit' ");
			Boolean go;
			Scanner scan = new Scanner(System.in);
			String choice = scan.nextLine();
			do{
			do {
				switch (choice){
				case "1":
					theGame.theGame();
					break;
				case "2":
					function.buyEquipment();
					go = true;
					break;
				case "3":
					function.sellEquipment();
					break;
				case "4":
					System.out.println("\n Upgrade menu \n");
					function.upgradeEquipment();
					go = true;
					break;
				case "5":
					queries.playerQuery();
					mainMenu();
					break;
				case "Exit":
					initialMenu();
				case "Help":

					System.out.println("     When inputting selections keep an eye on the words incased in quotation marks" );
					System.out.println("     sometimes you will need to have a capital for the first word of the selection   ");
					System.out.println("         but if you are reading the instruction on screen you should be able");
					System.out.println("              to realise when you need lowercase or uppercase letters.");
					System.out.println("        Where numbers are used in the display those should be used for selection.");
					System.out.println("                         To exit from any menu type 'Exit'.\n");
					System.out.println("                   ^^^^                    ^^^^  ");					
					System.out.println("                    (\")                     (\")  \n");
					System.out.println("  	 	                 ''  ");
					System.out.println("  		        \\                 /  ");
					System.out.println("  		         \\_______________/	     ");
					System.out.println("  		          \\_____________/	     ");
					System.out.println("  		           \\___________/	     \n");
					System.out.println(" 'Exit' \n");
					mainMenu();
					break;				
				}
			} while (choice != "6");
		} while (go = false);
			if (go = true){
				initialMenu();
			};
	  
	}
}
