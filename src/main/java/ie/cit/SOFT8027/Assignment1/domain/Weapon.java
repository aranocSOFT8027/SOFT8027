package ie.cit.SOFT8027.Assignment1.domain;

import java.util.List;

import ie.cit.SOFT8027.Assignment1.interfaces.Item;

public class Weapon implements Item{

	private int id;

	private String name;
	
	private int level;
	
	private String weapontype;
	
	private int worth;
	
	private int upgradeCost;
	
	public int getUpgradeCost() {
		return upgradeCost;
	}

	public void setUpgradeCost(int upgradeCost) {
		this.upgradeCost = upgradeCost;
	}

	private List<Player> players;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWeapontype() {
		return weapontype;
	}

	public void setWeapontype(String weapontype) {
		this.weapontype = weapontype;
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

	@Override
	public String toString() {
		String out = "Movement [id: " + getId() + " Name: " + getName() + " Level: " + getLevel() + " Weapon type: " + getWeapontype() + ", Players:";
		for(Player a : players){
			out += a.toString();
		}
		return out;
	}
	
	

}
