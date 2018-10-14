CREATE DATABASE myrmia;

USE myrmia;

/**
    用户表
 */
DROP TABLE IF EXISTS t_users;
CREATE TABLE t_users (
    uid INTEGER PRIMARY KEY UNIQUE NOT NULL AUTO_INCREMENT,
    username VARCHAR (64) UNIQUE NOT NULL,
    password VARCHAR (64) NOT NULL,
    email VARCHAR (100),
    home_url VARCHAR (255),
    screen_name VARCHAR (100),
    created INTEGER (10) NOT NULL,
    activated INTEGER (10),
    logged INTEGER (10),
    group_name VARCHAR (16)
);
