package ie.cit.SOFT8027.Assignment1.domain;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import ie.cit.SOFT8027.Assignment1.ApplicationTest;

@Service
public class TheGame {
	
	@Autowired
	JdbcTemplate jdbcTemplate = new JdbcTemplate();
	
	@Autowired
	Queries queries;
	
	@Autowired
	ApplicationTest applicationTest;
	
	@Autowired
	Functions functions;
	
	public void theGame(){
		
		System.out.println("And so it begins. . . . .");
		System.out.println("You have 3 choices young warior");
		System.out.println("North");
		System.out.println("East");
		System.out.println("West");
		System.out.println("CHOOSE NOW!!");
		String sqlToll = "UPDATE players SET coinSack = coinsack - 2";
		int resultSetCoinSack = jdbcTemplate.update(sqlToll);
		
		int score;
		
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();

		do {
			switch(choice){
			case "North":
				String sqlToll2 = "UPDATE players SET coinSack = coinsack - 3";
				int resultSetCoinSackToll2 = jdbcTemplate.update(sqlToll2);
				System.out.println("You have entered the forbidden swamp of Genit Alsweat");
				System.out.println("Do not linger long in one spot for it will spread through out your legs");
				System.out.println("WAIT. . . ");
				System.out.println("Oh no");
				System.out.println("Its GENIT ALSWEAT");
				System.out.println("Do we run or fight?");
				String choice1 = scan.nextLine();
				if (choice1.equals("run")){
					System.out.println("That was close");
					applicationTest.mainMenu();
				} else
				if (choice1.equals("fight")){
						System.out.println("where do we attack? High, Low or Middle?");
						String fightChoice = scan.nextLine();
							if (fightChoice.equals("High")){
								System.out.println("Dam that didnt work! We must run away!");
								applicationTest.mainMenu();
							}else
								if (fightChoice.equals("Middle")){
									System.out.println("That just made it angry!");
									applicationTest.mainMenu();
								}else
									if (fightChoice.equals("Low")){
										System.out.println("Success! The creature is retreating!");
										String sqlReward = "UPDATE players SET coinSack = coinsack + 10 ";
										int resultSetCoinSack1 = jdbcTemplate.update(sqlReward);
										System.out.println("You have recieved 10 coins for you bravery");
										applicationTest.mainMenu();
									}while(fightChoice != "High &| Middle &| Low");
					}
				
			
			break;
			case "East":
				String sqlToll3 = "UPDATE players SET coinSack = coinsack - 2";
				int resultSetCoinSackTollE = jdbcTemplate.update(sqlToll3);
				System.out.println("This is the wide grass lands of Dick Headious the Large");
				System.out.println("We must tread carefully, for it is said that he grows large when provoked");
				System.out.println("God dam it. . . . we snaged his hare trap");
				System.out.println("Its Dick!");
				System.out.println("He's bigger and blacker than I'd imagined");
				System.out.println("Do we run or fight?");
				String choice2 = scan.nextLine();
				if (choice2.equals("run")){
					System.out.println("That was close");
					applicationTest.mainMenu();
				} else
				if (choice2.equals("fight")){
						System.out.println("where do we attack? High, Low or Middle?");
						String fightChoice = scan.nextLine();
							if (fightChoice.equals("High")){
								System.out.println("Nailed it!!");
								String sqlReward = "UPDATE players SET coinSack = coinsack + 8";
								int resultSetCoinSack1 = jdbcTemplate.update(sqlReward);
								System.out.println("You have recieved 8 coins for you bravery");
								applicationTest.mainMenu();
							}else
								if (fightChoice.equals("Middle")){
									System.out.println("It nearly slammed me! retreat!");
									applicationTest.mainMenu();
								}else
									if (fightChoice.equals("Low")){
										System.out.println("I think he liked that! RUN AWAY!!");
										applicationTest.mainMenu();
									}while(fightChoice != "High &| Middle &| Low");
					}
				
			break;
			case "West":
				String sqlToll4 = "UPDATE players SET coinSack = coinsack - 1";
				int resultSetCoinSackTollW = jdbcTemplate.update(sqlToll4);
				System.out.println("Keep your eyes open, for this is the layer of Lady Double Dees");
				System.out.println("If you see her try not to be mesmerized by her womanly ways");
				System.out.println("For she is the high priestess of the hexenbeast council");
				System.out.println("What is that sound. . . .");
				System.out.println("She is behind us, strick at her weapons befor its to late!!");
				System.out.println("Do we run or fight?");
				String choice3 = scan.nextLine();
				if (choice3.equals("run")){
					System.out.println("That was close");
					applicationTest.mainMenu();
				} else
				if (choice3.equals("fight")){
						System.out.println("where do we attack? High, Low or Middle?");
						String fightChoice = scan.nextLine();
							if (fightChoice.equals("High")){
								System.out.println("Don't look down or the cresvis will consume you! Away!!");

								applicationTest.mainMenu();
							}else
								if (fightChoice.equals("Middle")){
									System.out.println("Boob ya!! Gotcha!");
									String sqlReward = "UPDATE players SET coinSack = coinsack + 6";
									int resultSetCoinSack1 = jdbcTemplate.update(sqlReward);
									System.out.println("You have recieved 6 coins for you bravery");
									applicationTest.mainMenu();
								}else
									if (fightChoice.equals("Low")){
										System.out.println("Their on my head!! What do I do now?? \n Duck and roll away to freedom");
										applicationTest.mainMenu();
									}while(fightChoice != "High &| Middle &| Low");
					}
			
			break;
		}while(choice != "run &| fight");
	
	}while(choice != "North &| East &| West");
	
}
}