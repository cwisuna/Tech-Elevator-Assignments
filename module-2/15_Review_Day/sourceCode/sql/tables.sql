

CREATE TABLE Hotel (
	hotel_id serial NOT NULL,
	hotel_name varchar(50) NOT NULL,
	stars int NOT NULL DEFAULT 0,
	rooms_available int NOT NULL DEFAULT 0,
	cost_per_night numeric(9,2),
	cover_image varchar(1000) NULL,
	CONTRAINT pk_hotel PRIMARY KEY (hotel_id),
);

CREATE TABLE Address (
	address_id serial NOT NULL,
	hotel_id int NOT NULL,
	address varchar(200) NOT NULL
	address varchar(200) NULL,
	city varchar(100) NOT NULL,
	state_name varchar(50) NOT NULL,
	postal_code varchar(12) NULL,
	CONTRAINT pk_address PRIMARY KEY (address_id)
	CONTRAINT fk_address FOREIGN KEY (hotel_id) REFERENCES Hotel(hotel_id)

);

CREATE TABLE Reservation (
	reservation_id serial NOT NULL,
	hotel_id int NOT NULL,
	full_name varchar(200) NOT NULL,
	checkin_date DATE NOT NULL,
	checkout_date DATE NOT NULL,
	guest int NOT NULL,
	CONTRAINT pk_reservation PRIMARY KEY (reservation_id)
	CONTRAINT fk_reservation FOREIGN KEY (hotel_id) REFERENCES Hotel(hotel_id)

);