create schema `mydb` default character set utf8mb4 collate utf8mb4_general_ci;

use mydb;

create table user (
	`id_pk` INT NOT NULL primary key auto_increment,
    `name` varchar(10) NOT NULL,
    `user_id` varchar(10) NOT NULL unique,
    `password` varchar(10) NOT NULL,
    `age` tinyint unsigned,
    `membership` tinyint default 0,
    `register_date` datetime default current_timestamp,
    `update_date` datetime default current_timestamp on update current_timestamp
);user