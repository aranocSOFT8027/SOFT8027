CREATE TABLE players (
		id 			int(15) NOT NULL AUTO_INCREMENT,
		name		varchar(25) NOT NULL,
		userName	varchar(35) NOT NULL,
		coinSack	int(8),
		PRIMARY KEY (id)
);

CREATE TABLE weapons (
		id 			int(15) NOT NULL AUTO_INCREMENT,
		name		varchar(50) NOT NULL,
		level 		int(4),
		weapontype	varchar(15),
		worth		int(40),
		upgradeCost int(40),
		PRIMARY KEY (id)
);


CREATE TABLE armour (
		id 			int(15) NOT NULL AUTO_INCREMENT,
		name		varchar(50) NOT NULL,
		level		int(4),
		worth		int(40),
		upgradeCost int(40),
		PRIMARY KEY (id)
);

CREATE TABLE equipment (
		player_id int(15) NOT NULL,
		primary_weapon_id int(15) NOT NULL,
		secondary_weapon_id int(15) NOT NULL,
		armour_id1 int(15) NOT NULL,
		armour_id2 int(15) NOT NULL,
		PRIMARY KEY (player_id, primary_weapon_id, secondary_weapon_id, armour_id1, armour_id2)
);
