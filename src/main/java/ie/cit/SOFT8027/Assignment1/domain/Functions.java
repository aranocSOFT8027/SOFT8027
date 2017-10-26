package ie.cit.SOFT8027.Assignment1.domain;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ie.cit.SOFT8027.Assignment1.ApplicationTest;

@Service
public class Functions {  
	
	@Autowired
	JdbcTemplate jdbcTemplate = new JdbcTemplate();
	
	@Autowired
	Queries queries;
	
	@Autowired
	ApplicationTest applicationTest;
	
    //@Autowired
	public void buyEquipment(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Would you like to buy a weapon or some armour? input weapon or armour");
		String choice = scan.nextLine();
		do {
			switch(choice){
			case "weapon":
				System.out.println("Is it your primary or secondary weapon?");
				String option = scan.nextLine();
				if(option.equals("primary")){
					displayAllWeapons();
					System.out.println("Select which item you would like by entering its id");
					String selection = scan.nextLine();
						if (selection.equals("1")){
							String sql = "UPDATE equipment SET primary_weapon_id = 1";
							int resultSet = jdbcTemplate.update(sql);
							queries.playerQuery();
							String coinSackQuery = "SELECT w.worth, w.id, e.primary_weapon_id FROM weapons w, equipment e WHERE e.primary_weapon_id = w.id";
							List<Map<String, Object>> resultSet2 = jdbcTemplate.queryForList(coinSackQuery);
							for (Map<String, Object> row : resultSet2) {
								Object worth = row.get("worth");
								int worth1 = (int) worth;
								String updateCoinSack = "UPDATE players SET coinSack = coinsack - " + worth1;
								int resultSetCoinSack = jdbcTemplate.update(updateCoinSack);
								System.out.println(worth);
							}							  
						}else
							if (selection.equals("2")){
								String sql = "UPDATE equipment SET primary_weapon_id = 2";
								int resultSet = jdbcTemplate.update(sql);
								//playerQuery();
								String coinSackQuery = "SELECT w.worth, w.id, e.primary_weapon_id FROM weapons w, equipment e WHERE e.primary_weapon_id = w.id";
								List<Map<String, Object>> resultSet2 = jdbcTemplate.queryForList(coinSackQuery);
								for (Map<String, Object> row : resultSet2) {
									Object worth = row.get("worth");
									int worth1 = (int) worth;
									String updateCoinSack = "UPDATE players SET coinSack = coinsack - " + worth1;
									int resultSetCoinSack = jdbcTemplate.update(updateCoinSack);
									System.out.println(worth);
								}		  
							}
							else
								if (selection.equals("3")){
									String sql = "UPDATE equipment SET primary_weapon_id = 3";
									int resultSet = jdbcTemplate.update(sql);  
									//playerQuery();
									String coinSackQuery = "SELECT w.worth, w.id, e.primary_weapon_id FROM weapons w, equipment e WHERE e.primary_weapon_id = w.id";
									List<Map<String, Object>> resultSet2 = jdbcTemplate.queryForList(coinSackQuery);
									for (Map<String, Object> row : resultSet2) {
										Object worth = row.get("worth");
										int worth1 = (int) worth;
										String updateCoinSack = "UPDATE players SET coinSack = coinsack - " + worth1;
										int resultSetCoinSack = jdbcTemplate.update(updateCoinSack);
										System.out.println(worth);
									}
								}
								else
									if (selection.equals("4")){
										String sql = "UPDATE equipment SET primary_weapon_id = 4";
										int resultSet = jdbcTemplate.update(sql); 
										//playerQuery();
										String coinSackQuery = "SELECT w.worth, w.id, e.primary_weapon_id FROM weapons w, equipment e WHERE e.primary_weapon_id = w.id";
										List<Map<String, Object>> resultSet2 = jdbcTemplate.queryForList(coinSackQuery);
										for (Map<String, Object> row : resultSet2) {
											Object worth = row.get("worth");
											int worth1 = (int) worth;
											String updateCoinSack = "UPDATE players SET coinSack = coinsack - " + worth1;
											int resultSetCoinSack = jdbcTemplate.update(updateCoinSack);
											System.out.println(worth);
										} 
									}	
				}
				if(option.equals("secondary")){
					displayAllWeapons();
					System.out.println("Select which item you would like by entering its id");
					String selection = scan.nextLine();

						if (selection.equals("1")){
							String sql = "UPDATE equipment SET secondary_weapon_id = 1";
							int resultSet = jdbcTemplate.update(sql); 
							String coinSackQuery = "SELECT w.worth, w.id, e.secondary_weapon_id FROM weapons w, equipment e WHERE e.secondary_weapon_id = w.id";
							List<Map<String, Object>> resultSet2 = jdbcTemplate.queryForList(coinSackQuery);
							for (Map<String, Object> row : resultSet2) {
								Object worth = row.get("worth");
								int worth1 = (int) worth;
								String updateCoinSack = "UPDATE players SET coinSack = coinsack - " + worth1;
								int resultSetCoinSack = jdbcTemplate.update(updateCoinSack);
								System.out.println(worth);
							} 
						}else
							if (selection.equals("2")){
								String sql = "UPDATE equipment SET secondary_weapon_id = 2";
								int resultSet = jdbcTemplate.update(sql);
								String coinSackQuery = "SELECT w.worth, w.id, e.secondary_weapon_id FROM weapons w, equipment e WHERE e.secondary_weapon_id = w.id";
								List<Map<String, Object>> resultSet2 = jdbcTemplate.queryForList(coinSackQuery);
								for (Map<String, Object> row : resultSet2) {
									Object worth = row.get("worth");
									int worth1 = (int) worth;
									String updateCoinSack = "UPDATE players SET coinSack = coinsack - " + worth1;
									int resultSetCoinSack = jdbcTemplate.update(updateCoinSack);
									System.out.println(worth);
								} 
							}
							else
								if (selection.equals("3")){
									String sql = "UPDATE equipment SET secondary_weapon_id = 3";
									int resultSet = jdbcTemplate.update(sql);
									String coinSackQuery = "SELECT w.worth, w.id, e.secondary_weapon_id FROM weapons w, equipment e WHERE e.secondary_weapon_id = w.id";
									List<Map<String, Object>> resultSet2 = jdbcTemplate.queryForList(coinSackQuery);
									for (Map<String, Object> row : resultSet2) {
										Object worth = row.get("worth");
										int worth1 = (int) worth;
										String updateCoinSack = "UPDATE players SET coinSack = coinsack - " + worth1;
										int resultSetCoinSack = jdbcTemplate.update(updateCoinSack);
										System.out.println(worth);
									} 
								}
								else
									if (selection.equals("4")){
										String sql = "UPDATE equipment SET secondary_weapon_id = 4";
										int resultSet = jdbcTemplate.update(sql);  
										String coinSackQuery = "SELECT w.worth, w.id, e.secondary_weapon_id FROM weapons w, equipment e WHERE e.secondary_weapon_id = w.id";
										List<Map<String, Object>> resultSet2 = jdbcTemplate.queryForList(coinSackQuery);
										for (Map<String, Object> row : resultSet2) {
											Object worth = row.get("worth");
											int worth1 = (int) worth;
											String updateCoinSack = "UPDATE players SET coinSack = coinsack - " + worth1;
											int resultSetCoinSack = jdbcTemplate.update(updateCoinSack);
											System.out.println(worth);
										} 
									}	
				}
				//playerQuery();
				buyEquipment();
				
			break;
			case "armour":

				System.out.println("Is it your armour1 or armour2?");
				String option1 = scan.nextLine();
				if(option1.equals("armour1")){
					displayAllArmour();
					System.out.println("Select which item you would like by entering its id");
					String selection1 = scan.nextLine();

						if (selection1.equals("1")){
							String sql = "UPDATE equipment SET armour_id1 = 1";
							int resultSet = jdbcTemplate.update(sql);  
							String coinSackQuery = "SELECT a.worth, a.id, e.armour_id1 FROM armour a, equipment e WHERE e.armour_id1 = a.id";
							List<Map<String, Object>> resultSet2 = jdbcTemplate.queryForList(coinSackQuery);
							for (Map<String, Object> row : resultSet2) {
								Object worth = row.get("worth");
								int worth1 = (int) worth;
								String updateCoinSack = "UPDATE players SET coinSack = coinsack - " + worth1;
								int resultSetCoinSack = jdbcTemplate.update(updateCoinSack);
								System.out.println(worth);
							}
							
						}else
							if (selection1.equals("2")){
								String sql = "UPDATE equipment SET armour_id1 = 2";
								int resultSet = jdbcTemplate.update(sql);  
								String coinSackQuery = "SELECT a.worth, a.id, e.armour_id1 FROM armour a, equipment e WHERE e.armour_id1 = a.id";
								List<Map<String, Object>> resultSet2 = jdbcTemplate.queryForList(coinSackQuery);
								for (Map<String, Object> row : resultSet2) {
									Object worth = row.get("worth");
									int worth1 = (int) worth;
									String updateCoinSack = "UPDATE players SET coinSack = coinsack - " + worth1;
									int resultSetCoinSack = jdbcTemplate.update(updateCoinSack);
									System.out.println(worth);
								}
							}
							else
								if (selection1.equals("3")){
									String sql = "UPDATE equipment SET armour_id1 = 3";
									int resultSet = jdbcTemplate.update(sql);
									String coinSackQuery = "SELECT a.worth, a.id, e.armour_id1 FROM armour a, equipment e WHERE e.armour_id1 = a.id";
									List<Map<String, Object>> resultSet2 = jdbcTemplate.queryForList(coinSackQuery);
									for (Map<String, Object> row : resultSet2) {
										Object worth = row.get("worth");
										int worth1 = (int) worth;
										String updateCoinSack = "UPDATE players SET coinSack = coinsack - " + worth1;
										int resultSetCoinSack = jdbcTemplate.update(updateCoinSack);
										System.out.println(worth);
									}
								}
								else
									if (selection1.equals("4")){
										String sql = "UPDATE equipment SET armour_id1 = 4";
										int resultSet = jdbcTemplate.update(sql);
										String coinSackQuery = "SELECT a.worth, a.id, e.armour_id1 FROM armour a, equipment e WHERE e.armour_id1 = a.id";
										List<Map<String, Object>> resultSet2 = jdbcTemplate.queryForList(coinSackQuery);
										for (Map<String, Object> row : resultSet2) {
											Object worth = row.get("worth");
											int worth1 = (int) worth;
											String updateCoinSack = "UPDATE players SET coinSack = coinsack - " + worth1;
											int resultSetCoinSack = jdbcTemplate.update(updateCoinSack);
											System.out.println(worth);
										}
									}	
				}
				if(option1.equals("armour2")){
					displayAllArmour();
					System.out.println("Select which item you would like by entering its id");
					String selection1 = scan.nextLine();

						if (selection1.equals("1")){
							String sql = "UPDATE equipment SET armour_id2 = 1";
							int resultSet = jdbcTemplate.update(sql);
							String coinSackQuery = "SELECT a.worth, a.id, e.armour_id2 FROM armour a, equipment e WHERE e.armour_id2 = a.id";
							List<Map<String, Object>> resultSet2 = jdbcTemplate.queryForList(coinSackQuery);
							for (Map<String, Object> row : resultSet2) {
								Object worth = row.get("worth");
								int worth1 = (int) worth;
								String updateCoinSack = "UPDATE players SET coinSack = coinsack - " + worth1;
								int resultSetCoinSack = jdbcTemplate.update(updateCoinSack);
								System.out.println(worth);
							}
						}else
							if (selection1.equals("2")){
								String sql = "UPDATE equipment SET armour_id2 = 2";
								int resultSet = jdbcTemplate.update(sql); 
								String coinSackQuery = "SELECT a.worth, a.id, e.armour_id2 FROM armour a, equipment e WHERE e.armour_id2 = a.id";
								List<Map<String, Object>> resultSet2 = jdbcTemplate.queryForList(coinSackQuery);
								for (Map<String, Object> row : resultSet2) {
									Object worth = row.get("worth");
									int worth1 = (int) worth;
									String updateCoinSack = "UPDATE players SET coinSack = coinsack - " + worth1;
									int resultSetCoinSack = jdbcTemplate.update(updateCoinSack);
									System.out.println(worth);
								}
							}
							else
								if (selection1.equals("3")){
									String sql = "UPDATE equipment SET armour_id2 = 3";
									int resultSet = jdbcTemplate.update(sql); 
									String coinSackQuery = "SELECT a.worth, a.id, e.armour_id2 FROM armour a, equipment e WHERE e.armour_id2 = a.id";
									List<Map<String, Object>> resultSet2 = jdbcTemplate.queryForList(coinSackQuery);
									for (Map<String, Object> row : resultSet2) {
										Object worth = row.get("worth");
										int worth1 = (int) worth;
										String updateCoinSack = "UPDATE players SET coinSack = coinsack - " + worth1;
										int resultSetCoinSack = jdbcTemplate.update(updateCoinSack);
										System.out.println(worth);
									}
								}
								else
									if (selection1.equals("4")){
										String sql = "UPDATE equipment SET armour_id2 = 4";
										int resultSet = jdbcTemplate.update(sql);  
										String coinSackQuery = "SELECT a.worth, a.id, e.armour_id2 FROM armour a, equipment e WHERE e.armour_id2 = a.id";
										List<Map<String, Object>> resultSet2 = jdbcTemplate.queryForList(coinSackQuery);
										for (Map<String, Object> row : resultSet2) {
											Object worth = row.get("worth");
											int worth1 = (int) worth;
											String updateCoinSack = "UPDATE players SET coinSack = coinsack - " + worth1;
											int resultSetCoinSack = jdbcTemplate.update(updateCoinSack);
											System.out.println(worth);
										}
									}	
				}
				//playerQuery();
				buyEquipment();
			
			break;
			case "Exit":
			applicationTest.mainMenu();
			}
		}while (choice != "weapon &| armour &| Exit");

	}
	
	public void sellEquipment(){
		queries.playerQuery();
		System.out.println("Which of your items you'd like to sell");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
				if (choice.equals("Primary weapon")){
				String coinSackQuery = "SELECT w.worth, w.id, e.primary_weapon_id FROM weapons w, equipment e WHERE e.primary_weapon_id = w.id";
				List<Map<String, Object>> resultSet2 = jdbcTemplate.queryForList(coinSackQuery);
				for (Map<String, Object> row : resultSet2) {
					Object worth = row.get("worth");
					int worth1 = (int) worth;
					String updateCoinSack = "UPDATE players SET coinSack = coinsack + " + worth1;
					int resultSetCoinSack = jdbcTemplate.update(updateCoinSack);
					System.out.println(worth);
				}

				String sql = "UPDATE equipment SET primary_weapon_id = 0";
				int resultSet = jdbcTemplate.update(sql); 
				}else 
					if (choice.equals("Secondary weapon")){
						
						String coinSackQuery = "SELECT w.worth, w.id, e.secondary_weapon_id FROM weapons w, equipment e WHERE e.secondary_weapon_id = w.id";
						List<Map<String, Object>> resultSet2 = jdbcTemplate.queryForList(coinSackQuery);
						for (Map<String, Object> row : resultSet2) {
							Object worth = row.get("worth");
							int worth1 = (int) worth;
							String updateCoinSack = "UPDATE players SET coinSack = coinsack + " + worth1;
							int resultSetCoinSack = jdbcTemplate.update(updateCoinSack);
							System.out.println(worth);
						}
						
					String sql = "UPDATE equipment SET secondary_weapon_id = 0";
					int resultSet = jdbcTemplate.update(sql); 
					}else
						if (choice.equals("Armour 1")){
							
							String coinSackQuery = "SELECT a.worth, a.id, e.armour_id1 FROM armour a, equipment e WHERE e.armour_id1 = a.id";
							List<Map<String, Object>> resultSet2 = jdbcTemplate.queryForList(coinSackQuery);
							for (Map<String, Object> row : resultSet2) {
								Object worth = row.get("worth");
								int worth1 = (int) worth;
								String updateCoinSack = "UPDATE players SET coinSack = coinsack + " + worth1;
								int resultSetCoinSack = jdbcTemplate.update(updateCoinSack);
								System.out.println(worth);
							}
							
							String sql = "UPDATE equipment SET armour_id1 = 0";
							int resultSet = jdbcTemplate.update(sql); 
							}else
								if (choice.equals("Armour 2")){
									
									
									String coinSackQuery = "SELECT a.worth, a.id, e.armour_id2 FROM armour a, equipment e WHERE e.armour_id2 = a.id";
									List<Map<String, Object>> resultSet2 = jdbcTemplate.queryForList(coinSackQuery);
									for (Map<String, Object> row : resultSet2) {
										Object worth = row.get("worth");
										int worth1 = (int) worth;
										String updateCoinSack = "UPDATE players SET coinSack = coinsack + " + worth1;
										int resultSetCoinSack = jdbcTemplate.update(updateCoinSack);
										System.out.println(worth);
									}
									
									String sql = "UPDATE equipment SET armour_id2 = 0";
									int resultSet = jdbcTemplate.update(sql); 
									}else 
										if (choice.equals("Exit")){
											applicationTest.mainMenu();
										}
					
		System.out.println("\n");
		//playerQuery();
		sellEquipment();
		
	}

	
	public void upgradeEquipment(){
		System.out.println("Would you like to upgrade your weapons or armour");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		do {
			switch (input){
			case "weapons":
				//playerQuery();
				displayAllWeapons(); //
				System.out.println("Select the item you want to upgrade by number");
				//Scanner scan = new Scanner(System.in);
				String choice1 = scan.nextLine();
				if (choice1.equals("Exit")) {
					applicationTest.mainMenu();
				}else{
				String uCostid = choice1;
				
				
				String sql1 = "UPDATE WEAPONS SET level = level + 1, worth = worth + worth WHERE id = " + choice1;
				String cost = "SELECT WORTH FROM WEAPONS";
				//for the buying and selling fuctions I will need to write a select query befor the update query to get the current value 
				//of the given item (save it to a vairiable) and add or subtract it from the players coinSack then carry out the function 
				String sqlCost = "UPDATE PLAYERs SET coinSack = coinsack - " + cost + " WHERE id = " + uCostid;
				
				int resultSet1 = jdbcTemplate.update(sql1);  // updates the DB
				int resultSetUCost = jdbcTemplate.update(sqlCost);
				System.out.println("\n");
				displayAllWeapons();
				System.out.println("\n");
				//playerQuery();
				
				upgradeEquipment();
				}
				break;
			case "armour":
				//playerQuery();
				displayAllArmour(); //
				System.out.println("Select the item you want to upgrade by number");
				//Scanner scan = new Scanner(System.in);
				String choice2 = scan.nextLine();
				String uCostid2 = choice2;
				
				String sql2 = "UPDATE ARMOUR SET level = level + 1, worth = worth + worth WHERE id = " + choice2;
				String cost1 = "SELECT WORTH FROM ARMOUR";
				String sqlCost1 = "UPDATE PLAYERS SET coinSack = coinsack - " + cost1 + " WHERE id = " + uCostid2;
				
				int resultSet2 = jdbcTemplate.update(sql2);  // updates the DB
				int resultSetUCost1 = jdbcTemplate.update(sqlCost1);
				System.out.println("\n");
				displayAllArmour();
				System.out.println("\n");
				
				//playerQuery();
				
				upgradeEquipment();
				break;
			case "Exit":
				
				applicationTest.mainMenu();
			}
		}while (input != "weapon &| armour");
	
	}
	public void displayAllWeapons(){
		
		//this code works when it is placed in the ApplicationTest class
		String sql = "SELECT * FROM weapons";
		System.out.println("Equipment");

		List<Map<String, Object>> resultSet = jdbcTemplate.queryForList(sql);
		
		for (Map<String, Object> row : resultSet) {
			System.out.println("Id: " + row.get("id"));
			System.out.println("Armour 1: " + row.get("name"));
			System.out.println("Level: " + row.get("level"));
			System.out.println("Worth: " + row.get("worth"));
		}
	}

	
	public void displayAllArmour() {
		
		//this code works when it is placed in the ApplicationTest class
		String sql = "SELECT * FROM armour";
		System.out.println("Equipment");

		List<Map<String, Object>> resultSet = jdbcTemplate.queryForList(sql);
		
		for (Map<String, Object> row : resultSet) {
			System.out.println("Id: " + row.get("id"));
			System.out.println("Armour 1: " + row.get("name"));
			System.out.println("Level: " + row.get("level"));
			System.out.println("Worth: " + row.get("worth"));
		}
	}
	
}
