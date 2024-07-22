use sqldb;

create table tbl2 (
	`a` int primary key,
    `b` int unique,
    `c` int unique,
    `d` int
);

show index from tbl2;