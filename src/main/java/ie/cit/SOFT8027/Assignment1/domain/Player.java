package ie.cit.SOFT8027.Assignment1.domain;

import java.util.Collections;
import java.util.List;


public class Player {
	
	private int id;

	private String name;
	
	private String userName;
	
	private int coinSack;
	
	private  List<Weapon> weapons;
	
	private List<Armour> armour;
	
	public Player(){
		armour = Collections.<Armour>emptyList();
		weapons = Collections.<Weapon>emptyList();
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		
		String out = "Player [id: " + getId() + ", Name:" + getName() + ", User Name: " + getUserName() + 
						", Coin sack: " + getCoinSack() + ", Weapons:[ ";
		for (Weapon w : weapons) {
			out += w.toString() + ",";
		}
		out += "]]";
		return out;
		//return "Player [name=" + name + ", userName=" + userName + ", coinSack=" + coinSack + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getCoinSack() {
		return coinSack;
	}

	public void setCoinSack(int coinSack) {
		this.coinSack = coinSack;
	}

	public List<Weapon> getWeapons() {
		return weapons;
	}

	public void setWeapons(List <Weapon> weaponList) {
		this.weapons = weaponList;
	}

	public List<Armour> getArmour() {
		return armour;
	}

	public void setArmour(List<Armour> armourList) {
		this.armour = armourList;
	}
	
}


/**	public void setItemsList(List<ItemImpl> itemsList) {
this.itemsList = itemsList;
}
*/