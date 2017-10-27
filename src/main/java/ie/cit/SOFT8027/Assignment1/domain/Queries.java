package ie.cit.SOFT8027.Assignment1.domain;

import java.util.List;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

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
import org.springframework.stereotype.Service;

import ie.cit.SOFT8027.Assignment1.domain.Armour;
import ie.cit.SOFT8027.Assignment1.domain.Menu;
import ie.cit.SOFT8027.Assignment1.domain.Player;
import ie.cit.SOFT8027.Assignment1.domain.Weapon;
import ie.cit.SOFT8027.Assignment1.rowmappers.PlayerRowMapper;

@Service
public class Queries {   
				
		@Autowired
		JdbcTemplate jdbcTemplate;

		public void playerQuery(){
			
			System.out.println("\nQuery 1 (List player 1  and weapons using result set Map)\n---------------");
			
			String sql = "SELECT * FROM players WHERE id = 1";
			List<Map<String, Object>> resultSet = jdbcTemplate.queryForList(sql);
			
			for (Map<String, Object> row : resultSet) {
				System.out.println("Name: " + row.get("name"));
				System.out.println("ID: " + row.get("id"));
				System.out.println("UserName " + row.get("userName"));
				System.out.println("Coin sack: " + row.get("coinSack"));
			}
			equipmentList();
		}
		
		public void equipmentList(){
			weapon1();
			weapon2();
			armour1();
			armour2();
		}
		
		public void weapon1(){
			
			System.out.println("\n weapon list \n---------------");
			
			String sql = "SELECT e.primary_weapon_id, w.id, w.name, w.level FROM equipment e, weapons w "
					+ "WHERE player_id = 1 AND e.primary_weapon_id = w.id";

			List<Map<String, Object>> resultSet = jdbcTemplate.queryForList(sql);
			
			for (Map<String, Object> row : resultSet) {
				System.out.println("Primary weapon: " + row.get("name") + "			" + "Level: " + row.get("level"));
			}
			
		}
		
		public void weapon2(){

			
			String sql = "SELECT e.secondary_weapon_id, w.id, w.name, w.level FROM equipment e, weapons w "
					+ "WHERE player_id = 1 AND e.secondary_weapon_id = w.id";

			List<Map<String, Object>> resultSet = jdbcTemplate.queryForList(sql);
			
			for (Map<String, Object> row : resultSet) {
				System.out.println("Secondary weapon: " + row.get("name") + "			" + "Level: " + row.get("level"));
			}
			
		}
		
		public void armour1(){

			
			String sql = "SELECT e.armour_id1, a.id, a.name, a.level FROM equipment e, armour a "
					+ "WHERE player_id = 1 AND e.armour_id1 = a.id";

			List<Map<String, Object>> resultSet = jdbcTemplate.queryForList(sql);
			
			for (Map<String, Object> row : resultSet) {
				System.out.println("Armour 1: " + row.get("name") + "			" + "Level: " + row.get("level"));
			}
		}
		
		public void armour2(){

			
			String sql = "SELECT e.armour_id2, a.id, a.name, a.level FROM equipment e, armour a "
					+ "WHERE player_id = 1 AND e.armour_id2 = a.id";

			List<Map<String, Object>> resultSet = jdbcTemplate.queryForList(sql);
			
			for (Map<String, Object> row : resultSet) {
				System.out.println("Armour 2: " + row.get("name") + "			" + "Level: " + row.get("level"));
			}
			System.out.println("\n----------------------      ");
		}
		
		public void displayAllWeapons(){
			
			String sql = "SELECT * FROM weapons";
			System.out.println("Equipment");

			List<Map<String, Object>> resultSet = jdbcTemplate.queryForList(sql);
			
			for (Map<String, Object> row : resultSet) {
				System.out.println("Id: " + row.get("id"));
				System.out.println("Armour 1: " + row.get("name"));
				System.out.println("Level: " + row.get("level"));
				System.out.println("Weapon type: " + row.get("weapontype"));
				System.out.println("Worth: " + row.get("worth"));
				System.out.println("Upgrade Cost: " + row.get("upgradeCost"));
			}
		}
		
		public void displayAllArmour() {
			
			String sql = "SELECT * FROM armour";
			System.out.println("Equipment");

			List<Map<String, Object>> resultSet = jdbcTemplate.queryForList(sql);
			
			for (Map<String, Object> row : resultSet) {
				System.out.println("Id: " + row.get("id"));
				System.out.println("Name: " + row.get("name"));
				System.out.println("Level: " + row.get("level"));
				System.out.println("Worth: " + row.get("worth"));
				System.out.println("Upgrade Cost: " + row.get("upgradeCost"));
			}
		}
		
}

