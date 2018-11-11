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

DROP TABLE IF EXISTS t_contents;
CREATE TABLE t_contents (
    cid INTEGER PRIMARY KEY AUTO_INCREMENT NOT NULL UNIQUE,
    title VARCHAR (255) NOT NULL,
    slug VARCHAR (255) UNIQUE,
    thumb_img VARCHAR(255),
    created INTEGER (10) NOT NULL,
    modified INTEGER (10),
    content TEXT,
    author_id INTEGER (10) NOT NULL,
    content_type VARCHAR (16) NOT NULL,
    status VARCHAR (16) NOT NULL,
    fmt_type VARCHAR (16) DEFAULT ('markdown'),
    tags VARCHAR (200),
    categories VARCHAR (200),
    hits INTEGER (10) DEFAULT (0),
    comments_num INTEGER (1) DEFAULT (0),
    allow_comment INTEGER (1) DEFAULT (1),
    allow_ping INTEGER (1),
    allow_feed INTEGER (1)
);

DROP TABLE IF EXISTS t_comments;
CREATE TABLE t_comments (
    coid INTEGER PRIMARY KEY AUTO_INCREMENT NOT NULL,
    cid INTEGER DEFAULT (0) NOT NULL,
    created INTEGER (10) NOT NULL,
    author_name VARCHAR (200) NOT NULL,
    author_id INTEGER (10) DEFAULT (0),
    owner_id INTEGER (10) DEFAULT (0),
    mail VARCHAR (200) NOT NULL,
    url VARCHAR (200),
    ip VARCHAR (64),
    agent VARCHAR (200),
    content TEXT NOT NULL,
    comment_type VARCHAR (16),
    status VARCHAR (16),
    parent_id INTEGER (10) DEFAULT (0)
);

DROP TABLE IF EXISTS t_logs;
CREATE TABLE t_logs (
    id INTEGER PRIMARY KEY AUTO_INCREMENT UNIQUE NOT NULL,
    action VARCHAR (100) NOT NULL,
    data VARCHAR (2000),
    author_id INTEGER (10) NOT NULL,
    ip VARCHAR (20),
    created INTEGER (10) NOT NULL
);

DROP TABLE IF EXISTS t_metas;
CREATE TABLE t_metas (
    mid INTEGER PRIMARY KEY AUTO_INCREMENT UNIQUE NOT NULL,
    name VARCHAR (200) NOT NULL,
    slug VARCHAR (200),
    metas_type VARCHAR (32) NOT NULL,
    description VARCHAR (255),
    sort INTEGER (4) DEFAULT (0),
    parent_id INTEGER (10) DEFAULT (0)
);

DROP TABLE IF EXISTS t_options;
CREATE TABLE t_options (
    options_name VARCHAR (100) PRIMARY KEY UNIQUE NOT NULL,
    options_value TEXT,
    description VARCHAR (255)
);

DROP TABLE IF EXISTS t_relationships;
CREATE TABLE t_relationships (
    rid INTEGER PRIMARY KEY AUTO_INCREMENT UNIQUE NOT NULL,
    cid INTEGER (10) NOT NULL,
    mid INTEGER (10) NOT NULL
);

DROP TABLE IF EXISTS t_attach;
CREATE TABLE t_attach (
    id INTEGER PRIMARY KEY AUTO_INCREMENT NOT NULL,
    file_name VARCHAR (100) NOT NULL,
    file_type VARCHAR (50),
    file_key VARCHAR (100) NOT NULL,
    author_id INTEGER (10) NOT NULL,
    created INTEGER (10) NOT NULL
);
