package ie.cit.SOFT8027.Assignment1.domain;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import ie.cit.SOFT8027.Assignment1.ApplicationTest;

import org.h2.expression.Function;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class Menu {
	@Autowired
	JdbcTemplate jdbcTemplate = new JdbcTemplate(); 
	
	@Autowired
	Queries queries;
	
	@Autowired
	Functions function;
	
	//@Autowired
	public void initialMenu(){
		System.out.println("         WLECOME  TO  . . . . . .  \n");
		System.out.println("    ---  KYLAR'S  VENGEANCE ---\n");
		System.out.println("*** enter 'play' to start game  ****\n");
		
		
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		do {
			switch (choice){
			case "play":
				Menu menu = new Menu();
				menu.mainMenu();
				break;
			case "Exit":
				return;
			}
		}while (choice != "Q");
	}
	
	public void mainMenu(){
		
		queries.playerQuery();
		System.out.println(" ---  KYLAR'S  VENGEANCE ---");
		
		System.out.println("   Main  Menu   ");
		System.out.println("1. Finish Round");
		System.out.println("2. Buy new equipment");
		System.out.println("3  Sell equipment");
		System.out.println("4. Upgrade equipment");
		System.out.println("5. Display player info");
		System.out.println(" Help");
		System.out.println(" Exit ");
		
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
				break;
			case "5":
				queries.playerQuery();
			case "Exit":
				initialMenu();
			case "Help":
				int i;
				for (i = 0; i < 1; i++){
				System.out.println("   heres the menu again  \n" );
				System.out.println("   Main  Menu   ");
				System.out.println("1. Finish Round");
				System.out.println("2. Buy new equipment");
				System.out.println("3  Sell equipment");
				System.out.println("4. Upgrade equipment");
				System.out.println("5. Exit ");
				}
				break;				
			}
		} while (choice != "7");
	}
	
	public void upgradeMenu(){
		System.out.println("So you want an upgrade. . .");
		System.out.println("is it a weapon or armour?");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		do {
			switch (choice){
			case "weapon":
				function.displayAllWeapons();
				function.upgradeEquipment();  
				break;
			case "armour":
				function.displayAllArmour();
				function.upgradeEquipment();
				break;
			case "Exit":
				mainMenu();
			}
		}while (choice != "weapon &| armour");
		
	}
	
}