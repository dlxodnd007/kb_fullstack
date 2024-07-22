# 첫번째 장
SHOW databases;

use employees;

show tables;

describe employees;

desc employees;

show columns from employees;

# 두번째 장
select * from titles;
select first_name from employees;
select first_name, last_name, gender from employees;

# 세번쩨 장
use employees;
select first_name as 이름, gender as 성별, hire_date as '회사 입사일'  from employees;

# 네번째 장
USE sqldb;
select * from usertbl where name = '김경호';
select * from usertbl where birthyear >= 1970 and height >= 182;

# 다섯번째 장
select * from usertbl where height >= 180 and height <= 183;
select * from usertbl where addr='경남' or addr='전북';
select * from usertbl where name like '김%';

# 여섯번째 장
select name, height from usertbl 
where height > (select height from usertbl where name='김경호');

# 일곱번째 장
select * from usertbl order by mDate asc;
select * from usertbl order by mDate desc;
select * from usertbl order by height desc, name desc;

# 여덟번째 장
select distinct addr from usertbl order by addr asc; 
