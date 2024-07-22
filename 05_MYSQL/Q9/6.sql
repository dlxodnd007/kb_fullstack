create database if not exists `testdb`;

use testdb;

drop table if exists usertbl;

create table usertbl (
	`userID` CHAR(8) NOT NULL PRIMARY KEY,
	`name` VARCHAR(10) NOT NULL,
	`birthYear` INT NOT NULL,
	`addr` NCHAR(2) NOT NULL
);

insert into usertbl(userId,name,birthYear,addr) values('LSG','이승기',1987,'서울');
insert into usertbl(userId,name,birthYear,addr) values('KBS','김범수',1979,'경남');
insert into usertbl(userId,name,birthYear,addr) values('KKH','김경호',1971,'전남');
insert into usertbl(userId,name,birthYear,addr) values('JYP','조용필',1950,'경기');
insert into usertbl(userId,name,birthYear,addr) values('SSK','성시경',1979,'서울');

select * from usertbl;