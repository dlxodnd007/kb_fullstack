use testdb;

alter table usertbl drop primary key;
alter table usertbl1 add constraint pk_name primary key(name);

select * from usertbl;
show index from usertbl;