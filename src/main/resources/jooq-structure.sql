DROP TABLE IF EXITS user;

CREATE TABLE user (
	id		INT NOT NULL PRIMARY KEY,
	name 	VARCHAR(50),
	email	VARCHAR(50)
);