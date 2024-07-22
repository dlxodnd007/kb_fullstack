use sqldb;

create table tbl4 (
	`a` int unique not null,
    `b` int unique,
    `c` int unique,
    `d` int
);

show index from tbl4;