package ie.cit.SOFT8027.Assignment1.domain;

import ie.cit.SOFT8027.Assignment1.interfaces.Item;

public class Armour implements Item{
	
	private int id;
	
	private String name;
	
	private int level;
	
	private int worth;
	
	private int upgradeCost;
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getWorth() {
		return worth;
	}

	public void setWorth(int worth) {
		this.worth = worth;
	}

	public int getUpgradeCost() {
		return upgradeCost;
	}

	public void setUpgradeCost(int upgradeCost) {
		this.upgradeCost = upgradeCost;
	}
	
	

}
