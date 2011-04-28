DROP DATABASE IF EXISTS DB;

CREATE DATABASE DB;

/*we're gonna have to decide what this is*/
GRANT ALL PRIVILEGES ON DB.* to user@localhost IDENTIFIED BY 'password';

USE DB;

/**this main table will contain all of the data for now*/
CREATE TABLE main(
	username VARCHAR(255),
	fullname VARCHAR(255),
	password VARCHAR(255),
	email VARCHAR(255),
	age VARCHAR(255),
	classyear VARCHAR(255),
	sex VARCHAR(255),
	orientation VARCHAR(255),
	description VARCHAR(1024),
	dorm VARCHAR(255),
	college VARCHAR(255),
	activities VARCHAR(1024),
	status VARCHAR(255),
	birthday VARCHAR(255),
	birthmonth VARCHAR(255),
	birthyear VARCHAR(255),
	seeking VARCHAR(1024),
	PRIMARY KEY (username)
);

CREATE TABLE messages(
	sender VARCHAR(255),
	recipient VARCHAR(255),
	message_body VARCHAR(6535),
	time_stamp DATE
);

INSERT INTO main (username, fullname, password) VALUES("administrator", "admin administrator", "administrator");
INSERT INTO main (username, fullname, password) VALUES("matt", "matt", "34");
INSERT INTO main (username, fullname, password) VALUES("bryce", "bryce", "bryce");
INSERT INTO main (username, fullname, password) VALUES("chrysanthia", "chrysanthia", "chrysanthia");
INSERT INTO main(
	username,
	fullname,
	password,
	email,
	age,
	classyear,
	sex,
	orientation,
	description,
	dorm,
	activities,
	status,
	birthday,
	birthmonth,
	birthyear,
	seeking,
	college
) VALUES ("david", "David Huie", "ihatecmc", "dahuie@gmail.com", "22", "Senior", "Male", "Straight", "Happy dude looking for love", "Linde", "hiking", "getting my code on", "Jan", "17", "1989", "LOVE", "Harvey Mudd")