
CREATE SEQUENCE customer_serial;

create TABLE Customer(
  customer_id int NOT NULL DEFAULT nextval('customer_serial'),
  customer_number varchar(20) NOT NULL,
  first_name varchar(50) NOT NULL,
  last_name varchar(50) NOT NULL,
  CONSTRAINT PK_customer PRIMARY KEY(customer_id)
);


CREATE SEQUENCE address_serial;

CREATE TABLE Address(
	address_id int NOT NULL DEFAULT nextval('address_serial'),
	customer_id int NOT NULL,
	address_type int NOT NULL,
	street_address1 varchar(150) NOT NULL,
	street_address2 varchar(150) NOT NULL,
	city varchar(50) NOT NULL,
	state_abbreviation (5) NOT NULL,
	CONSTRAINT PK_address PRIMARY KEY(address_id),
	CONSTRAINT FK_Address_Customer FOREIGN KEY(customer_id) REFERENCES Customer(customer_id)
);

CREATE SEQUENCE phone_serial;

CREATE TABLE Phone(
	phone_id int NOT NULL DEFAULT nextval('phone_serial'),
	customer_id int NOT NULL,
	phone_type int NOT NULL,
	phoneNumber varchar(12) NOT NULL,
	CONSTRAINT PK_phone PRIMARY KEY(phone_id),
	CONSTRAINT FK_Phone_Customer FOREIGN KEY(customer_id) REFERENCES Customer(customer_id)
);
