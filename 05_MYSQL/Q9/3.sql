use sqldb;

create table tbl3 (
	`a` int unique,
    `b` int unique,
    `c` int unique,
    `d` int
);

show index from tbl3;