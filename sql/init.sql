create database spring_cloud_alibaba_practice_master;
use spring_cloud_alibaba_practice_master;
CREATE TABLE product(
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    good_id BIGINT,
    good_name VARCHAR(255),
    num BIGINT,
    version int DEFAULT 0
);
INSERT INTO product(good_id,good_name,num) VALUES(1,'testA',100);

create database spring_cloud_alibaba_practice_slave1;
use spring_cloud_alibaba_practice_slave1;
CREATE TABLE product(
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    good_id BIGINT,
    good_name VARCHAR(255),
    num BIGINT,
    version int DEFAULT 0
);
INSERT INTO product(good_id,good_name,num) VALUES(1,'testA',100);

create database spring_cloud_alibaba_practice_slave2;
use spring_cloud_alibaba_practice_slave2;
CREATE TABLE product(
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    good_id BIGINT,
    good_name VARCHAR(255),
    num BIGINT,
    version int DEFAULT 0
);
INSERT INTO product(good_id,good_name,num) VALUES(1,'testA',100);