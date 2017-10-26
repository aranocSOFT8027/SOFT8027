package ie.cit.SOFT8027.Assignment1.domain;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

public class TheGame {
	
	public void theGame(){
		
		System.out.println("And so it begins. . . . .");
		System.out.println("You have 3 choices young warior");
		System.out.println("North");
		System.out.println("East");
		System.out.println("West");
		System.out.println("CHOOSE NOW!!");
		
		int score;
		
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
;
		do {
			switch(choice){
			case "North":
				System.out.println("You have entered the forbidden swamp of Genit Alsweat");
				System.out.println("Do not linger long in one spot for it will spread through out your legs");
				System.out.println("WAIT. . . ");
				System.out.println("Oh no");
				System.out.println("Its GENIT ALSWEAT");
				System.out.println("Do we run or fight?");
				String choice1 = scan.nextLine();
				if (choice1.equals("run")){
					System.out.println("That was close");
					
				}
				
			}
			break;
			switch(choice){
			case "East":
			}
			break;
			switch(choice){
			case "West":
			}
			break;
		}while(choice != "North &| East &| West");
	
	
}
