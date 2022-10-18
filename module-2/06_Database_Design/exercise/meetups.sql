--CREATING TABLES---
CREATE TABLE Member (
	member_id serial,
	last_name varchar(50) NOT NULL,
	first_name varchar(50) NOT NULL,
	email_address varchar(64) NOT NULL,
	phone_number char(10) NULL,
	birthday date,
	does_person_want_reminder boolean DEFAULT false,
	CONSTRAINT pk_member PRIMARY KEY(member_id)
    );

CREATE TABLE Interest_Group(
	group_id serial,
	group_name varchar(50) NOT NULL,
	CONSTRAINT pk_interest_group PRIMARY KEY(group_id)
    );
	
CREATE TABLE Event(
	event_id serial,
	event_name varchar(50) NOT NULL,
	description varchar(250) NOT NULL,
	start_date date NOT NULL,
	start_time time NOT NULL, 
	duration int CHECK(duration > 29) NOT NULL, 
	group_running_event int NOT NULL,
	CONSTRAINT pk_event PRIMARY KEY(event_id),
	CONSTRAINT fk_event FOREIGN KEY (group_running_event) REFERENCES Interest_Group(group_id)
    );
	
CREATE TABLE Member_Interest_Group(
	member_id int NOT NULL,
	group_id int NOT NULL,
	CONSTRAINT pk_member_interest_group PRIMARY KEY(member_id, group_id),
	CONSTRAINT fk_event_member_id FOREIGN KEY (member_id) REFERENCES Member(member_id),
	CONSTRAINT fk_event_group_id FOREIGN KEY (group_id) REFERENCES Interest_Group(group_id)
    );

CREATE TABLE Member_Event(
	member_id int NOT NULL,
	event_id int NOT NULL,
	CONSTRAINT pk_member_event PRIMARY KEY(member_id, event_id),
	CONSTRAINT fk_member_id FOREIGN KEY (member_id) REFERENCES Member(member_id),
	CONSTRAINT fk_event_id FOREIGN KEY (event_id) REFERENCES Event(event_id)
);
-----------------------------------------------------------------------------------------------------------
------------INSERT MEMBERS INTO MEMBER TABLE---------------------------------------------------------------
INSERT INTO member(last_name, first_name, email_address, phone_number, birthday, does_person_want_reminder)
	VALUES ('luna', 'chris', 'chris@gmail.com', '4191234567', '1997-08-20', true);
INSERT INTO member(last_name, first_name, email_address, phone_number, birthday, does_person_want_reminder)
	VALUES ('salami', 'mo', 'mo@yahoo.com', '4191234568', '1998-09-15', false);
INSERT INTO member(last_name, first_name, email_address, phone_number, birthday, does_person_want_reminder)
	VALUES ('hamilton', 'mason', 'mason@gmail.com', NULL, '2000-09-01', true);
INSERT INTO member(last_name, first_name, email_address, phone_number, birthday, does_person_want_reminder)
	VALUES ('fogel', 'camille', 'camille@gmail.com', '4191234562', '1992-05-21', false);
INSERT INTO member(last_name, first_name, email_address, phone_number, birthday, does_person_want_reminder)
	VALUES ('westondorf', 'greg', 'gregrocksmysocks@gmail.com', '4191234569', '1950-01-01', true);
INSERT INTO member(last_name, first_name, email_address, phone_number, birthday, does_person_want_reminder)
	VALUES ('ham', 'noah', 'noah@gmail.com', NULL, '1997-08-20' , true);
INSERT INTO member(last_name, first_name, email_address, phone_number, birthday, does_person_want_reminder)
	VALUES ('reed', 'hannah', 'hannah@gmail.com', NULL, '1989-08-20', true);
INSERT INTO member(last_name, first_name, email_address, phone_number, birthday, does_person_want_reminder)
	VALUES ('brauns', 'ben', 'ben@gmail.com', NULL, '1997-06-15', false);	

-------------------------------------------------------------------------------------------------------------
---INSERTING EVENTS INTO EVENTS TABLE------------------------------------------------------------------------
INSERT INTO event(event_name, description, start_date, start_time, duration, group_running_event)
	VALUES ('Fancy Pants', 'Wearing the faniest pants you can find from all over', '2022-01-11', '03:30:00' , 40, 
			(SELECT group_id
			FROM interest_group
			WHERE group_name = 'The Boys'))
			
INSERT INTO event(event_name, description, start_date, start_time, duration, group_running_event)
	VALUES ('Met Gala', 'Dress to impress', '2023-01-11', '04:30:00' , 50, 
			(SELECT group_id
			FROM interest_group
			WHERE group_name = 'Rich Boys'))
			
INSERT INTO event(event_name, description, start_date, start_time, duration, group_running_event)
	VALUES ('World Cup', 'Football teams from around the world compete for a big shiny trophy', '2025-01-11', '03:30:00' , 60, 
			(SELECT group_id
			FROM interest_group
			WHERE group_name = 'Rich Boys'))
			
INSERT INTO event(event_name, description, start_date, start_time, duration, group_running_event)
	VALUES ('Supernatural Con', 'A bunch of nerds who like supernatural dressed as characters from the CW show', '2023-01-11', '07:30:00' , 50, 
			(SELECT group_id
			FROM interest_group
			WHERE group_name = 'Supernatural Weirdos'))			
-----------------------------------------------------------------------------------------	
--------------INSERTING MEMBERID/EVENTID INTO MEMBER EVENT TABLE

START TRANSACTION;	
INSERT INTO member_event(member_id, event_id)
VALUES ((SELECT member_id
	      FROM member
		  WHERE first_name = 'chris' ), (SELECT event_id 
										 FROM event 
										 WHERE event_name = 'Fancy Pants'))
COMMIT; 
ROLLBACK;

START TRANSACTION;	
INSERT INTO member_event(member_id, event_id)
VALUES ((SELECT member_id
	      FROM member
		  WHERE first_name = 'mo' ), (SELECT event_id 
										 FROM event 
										 WHERE event_name = 'World Cup'))
COMMIT; 
ROLLBACK;
		  
START TRANSACTION;	
INSERT INTO member_event(member_id, event_id)
VALUES ((SELECT member_id
	      FROM member
		  WHERE first_name = 'camille' ), (SELECT event_id 
										 FROM event 
										 WHERE event_name = 'Supernatural Con'))
COMMIT; 
ROLLBACK;		  
		  
START TRANSACTION;	
INSERT INTO member_event(member_id, event_id)
VALUES ((SELECT member_id
	      FROM member
		  WHERE first_name = 'mason' ), (SELECT event_id 
										 FROM event 
										 WHERE event_name = 'Met Gala'))
COMMIT; 
ROLLBACK;			  


START TRANSACTION;	
INSERT INTO member_event(member_id, event_id)
VALUES ((SELECT member_id
	      FROM member
		  WHERE first_name = 'greg' ), (SELECT event_id 
										 FROM event 
										 WHERE event_name = 'Supernatural Con'))
COMMIT; 
ROLLBACK;			  
		  
START TRANSACTION;	
INSERT INTO member_event(member_id, event_id)
VALUES ((SELECT member_id
	      FROM member
		  WHERE first_name = 'ben' ), (SELECT event_id 
										 FROM event 
										 WHERE event_name = 'Fancy Pants'))
COMMIT; 
ROLLBACK;			  		  
		  
START TRANSACTION;	
INSERT INTO member_event(member_id, event_id)
VALUES ((SELECT member_id
	      FROM member
		  WHERE first_name = 'hannah' ), (SELECT event_id 
										 FROM event 
										 WHERE event_name = 'Supernatural Con'))
COMMIT; 
ROLLBACK;			  		  
		  
		  
START TRANSACTION;	
INSERT INTO member_event(member_id, event_id)
VALUES ((SELECT member_id
	      FROM member
		  WHERE first_name = 'noah' ), (SELECT event_id 
										 FROM event 
										 WHERE event_name = 'World Cup'))
COMMIT; 
ROLLBACK;			  		  
		  
		  
------------INSERTING MEMBERID/GROUPID INTO MEMBER INTEREST GROUP------------------		  
START TRANSACTION;
INSERT INTO member_interest_group(member_id, group_id)
VALUES ((SELECT member_id
	   FROM member
	   WHERE first_name = 'chris'), (SELECT group_id
				FROM interest_group
				WHERE group_name = 'The Boys'))
COMMIT;
ROLLBACK; 

START TRANSACTION;
INSERT INTO member_interest_group(member_id, group_id)
VALUES ((SELECT member_id
	   FROM member
	   WHERE first_name = 'mo'), (SELECT group_id
				FROM interest_group
				WHERE group_name = 'The Boys'))
COMMIT;
ROLLBACK; 

START TRANSACTION;
INSERT INTO member_interest_group(member_id, group_id)
VALUES ((SELECT member_id
	   FROM member
	   WHERE first_name = 'mason'), (SELECT group_id
				FROM interest_group
				WHERE group_name = 'Rich Boys'))
COMMIT;
ROLLBACK; 

START TRANSACTION;
INSERT INTO member_interest_group(member_id, group_id)
VALUES ((SELECT member_id
	   FROM member
	   WHERE first_name = 'camille'), (SELECT group_id
				FROM interest_group
				WHERE group_name = 'The Boys'))
COMMIT;
ROLLBACK; 

START TRANSACTION;
INSERT INTO member_interest_group(member_id, group_id)
VALUES ((SELECT member_id
	   FROM member
	   WHERE first_name = 'greg'), (SELECT group_id
				FROM interest_group
				WHERE group_name = 'Supernatural Weirdos'))
COMMIT;
ROLLBACK;

START TRANSACTION;
INSERT INTO member_interest_group(member_id, group_id)
VALUES ((SELECT member_id
	   FROM member
	   WHERE first_name = 'ben'), (SELECT group_id
				FROM interest_group
				WHERE group_name = 'Supernatural Weirdos'))
COMMIT;
ROLLBACK; 

START TRANSACTION;
INSERT INTO member_interest_group(member_id, group_id)
VALUES ((SELECT member_id
	   FROM member
	   WHERE first_name = 'noah'), (SELECT group_id
				FROM interest_group
				WHERE group_name = 'Rich Boys'))
COMMIT;
ROLLBACK; 

START TRANSACTION;
INSERT INTO member_interest_group(member_id, group_id)
VALUES ((SELECT member_id
	   FROM member
	   WHERE first_name = 'hannah'), (SELECT group_id
				FROM interest_group
				WHERE group_name = 'The Boys'))
COMMIT;
ROLLBACK; 



SELECT* from event
		   
SELECT* from member
		   
select * from interest_group
		   
select* from member_event

select* from member_interest_group
