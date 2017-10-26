package ie.cit.SOFT8027.rowmappers;

import java.sql.ResultSet;

import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ie.cit.SOFT8027.domain.Player;

public class PlayerRowMapper implements RowMapper<Player>{

	@Override
	public Player mapRow(ResultSet rs, int index) throws SQLException {
		Player player = new Player();

		player.setId(rs.getInt("id"));
		player.setName(rs.getString("name"));
		player.setUserName(rs.getString("userName"));
		player.setCoinSack(rs.getInt("coinSack"));
		//player.setItem(rs.getString("item"));
		return player;
	}

}
