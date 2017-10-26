package ie.cit.SOFT8027.Assignment1.repository;

import java.util.List;

import ie.cit.SOFT8027.Assignment1.domain.Player;

public interface playerRepository {

	Player get (int id);
	
	void save(Player artist);

	void remove(Player artist);
	
	List<Player> findAll();
}
