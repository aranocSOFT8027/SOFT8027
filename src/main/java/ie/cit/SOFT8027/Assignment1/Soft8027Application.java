package ie.cit.SOFT8027.Assignment1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ie.cit.SOFT8027.Assignment1.domain.Menu;
import ie.cit.SOFT8027.Assignment1.domain.Armour;
import ie.cit.SOFT8027.Assignment1.domain.Functions;
import ie.cit.SOFT8027.Assignment1.domain.Menu;
import ie.cit.SOFT8027.Assignment1.domain.Player;
import ie.cit.SOFT8027.Assignment1.domain.Queries;
import ie.cit.SOFT8027.Assignment1.domain.Weapon;
import ie.cit.SOFT8027.Assignment1.rowmappers.PlayerRowMapper;

@SpringBootApplication
public class Soft8027Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Soft8027Application.class, args);
		
		//Menu menu = new Menu();
		//menu.initialMenu();
	}

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
