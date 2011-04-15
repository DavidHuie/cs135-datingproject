DROP DATABASE IF EXISTS DB;

CREATE DATABASE DB;

/*we're gonna have to decide what this is*/
GRANT ALL PRIVILEGES ON bookDB.* to user@localhost IDENTIFIED BY 'password';

USE DB;

/**this main table will contain all of the data for now*/

CREATE TABLE main{
username VARCHAR(255),
password VARCHAR(255),
email VARCHAR(255),
age int,
sex VARCHAR(255),
orientation VARCHAR(255),
description VARCHAR(512),
}