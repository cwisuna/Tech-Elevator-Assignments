
BEGIN TRANSACTION;
DROP TABLE IF EXISTS Reservation, Address, Hotel;
DROP Sequence IF EXISTS seq_reservation_id, seq_address_id, seq_hotel_id;


CREATE TABLE Hotel (
	hotel_id serial  NOT NULL,
	hotel_name varchar(50) NOT NULL,
	stars int NOT NULL DEFAULT 0,
	rooms_available int NOT NULL DEFAULT 0,
	cost_per_night numeric(9,2),
	cover_image varchar(1000) NULL,
	CONSTRAINT pk_Hotel PRIMARY KEY (hotel_id)

);

CREATE TABLE Address (
	address_id  serial NOT NULL,
	hotel_id int NOT NULL,
	address varchar(200) NOT NULL,
	address2  varchar(200)  NULL,
	city varchar(100) NOT NULL,
	state_name varchar(50) NOT NULL,
	postal_code varchar(12) NULL,
	CONSTRAINT pk_address PRIMARY KEY (address_id),
	CONSTRAINT fk_Address_Hotel FOREIGN KEY (hotel_id) REFERENCES Hotel(hotel_id)
);


CREATE TABLE Reservation (
	reservation_id serial  NOT NULL,
	hotel_id int NOT NULL,
	full_name varchar(100) NOT NULL,
	checkinDate DATE NOT NULL,
	checkoutDate DATE NOT NULL,
	guest int NOT NULL,
	CONSTRAINT pk_reservation PRIMARY KEY (reservation_id),
	CONSTRAINT fk_Reservation_Hotel FOREIGN KEY (hotel_id) REFERENCES Hotel(hotel_id)
);

insert into Hotel(hotel_name, stars, rooms_available, cost_per_night )
  values ('Aloft Cleveland', 4, 48,274);
insert into Hotel(hotel_name, stars, rooms_available, cost_per_night )
  values ('Hilton Cleveland Downtown', 4, 12,287);
insert into Hotel(hotel_name, stars, rooms_available, cost_per_night )
  values ('Metropolitan at the 9', 5, 22,319);
insert into Hotel(hotel_name, stars, rooms_available, cost_per_night )
  values ('The Westin Pittsburgh', 4, 60,131);
insert into Hotel(hotel_name, stars, rooms_available, cost_per_night )
  values( 'Hilton Columbus Downtown', 4, 34,190);
insert into Hotel(hotel_name, stars, rooms_available, cost_per_night )
  values ('The Summit A Dolce Hotel', 4, 43,218);
insert into Hotel(hotel_name, stars, rooms_available, cost_per_night )
  values( 'Greektown Detroit', 4, 75,185);

insert into Address( hotel_id, address, address2, city, state_name, postal_code)
  values (7, '1200 St Antoine St',null,'Detroit','Michigan','48226');
insert into Address( hotel_id, address, address2, city, state_name, postal_code)
  values (2,'100 Lakeside Ave',null,'Cleveland','Ohio','44114');
  insert into Address( hotel_id, address, address2, city, state_name, postal_code)
    values (1, '1111 W 10th St',null,'Cleveland','Ohio','44115');
insert into Address( hotel_id, address, address2, city, state_name, postal_code)
  values (4, '1000 Penn Ave',null,'Pittsburgh','Pennsylvania','15222');
insert into Address( hotel_id, address, address2, city, state_name, postal_code)
  values (5, '401 N High St',null,'Columbus','Ohio','43215');
  insert into Address( hotel_id, address, address2, city, state_name, postal_code)
    values (3, '2017 E 9th St',null,'Cleveland','Ohio','48226');
insert into Address( hotel_id, address, address2, city, state_name, postal_code)
  values (6, '5345 Medpace Way',null,'Cincinnati','Ohio','43215');
COMMIT;