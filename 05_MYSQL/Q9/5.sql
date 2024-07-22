use sqldb;

create table tbl5 (
	`a` INT UNIQUE NOT NULL,
	`b` INT UNIQUE,
	`c` INT UNIQUE,
	`d` INT PRIMARY KEY
);

show index from tbl5;