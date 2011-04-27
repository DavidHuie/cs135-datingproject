DROP DATABASE IF EXISTS DB;

CREATE DATABASE DB;

/*we're gonna have to decide what this is*/
GRANT ALL PRIVILEGES ON DB.* to user@localhost IDENTIFIED BY 'password';

USE DB;

/**this main table will contain all of the data for now*/
CREATE TABLE main(
	username VARCHAR(255),
	password VARCHAR(255),
	email VARCHAR(255),
	age VARCHAR(255),
	classyear VARCHAR(255),
	sex VARCHAR(255),
	orientation VARCHAR(255),
	description VARCHAR(1024),
	dorm VARCHAR(255),
	activities VARCHAR(1024),
	status VARCHAR(255),
	birthday VARCHAR(255),
	birthmonth VARCHAR(255),
	birthyear VARCHAR(255),
	seeking VARCHAR(1024),
	PRIMARY KEY (username)
);

INSERT INTO main (username, password) VALUES("administrator", "administrator");