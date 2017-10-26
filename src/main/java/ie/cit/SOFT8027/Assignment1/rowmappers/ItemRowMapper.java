package ie.cit.SOFT8027.rowmappers;

import java.sql.ResultSet;


import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ie.cit.SOFT8027.domain.Armour;
import ie.cit.SOFT8027.interfaces.Item;

public class ItemRowMapper implements RowMapper<ie.cit.SOFT8027.interfaces.Item>{

	@Override
	public Item mapRow(ResultSet arg0, int arg1) throws SQLException {
		Armour bbobsKnob = new Armour();
		return bbobsKnob;
	}

}
