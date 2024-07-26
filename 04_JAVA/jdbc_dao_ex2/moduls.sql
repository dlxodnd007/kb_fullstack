use world;
describe city;

select * from city;
select * from country;

insert into `city`(Name, CountryCode, District, Population) values ("TETZ","KOR","TETZ",1);

select * from city where Name = "TETZ";

update city set Population = 0 where name = 'tetz';

delete from city where name = 'tetz';

select  Name, CountryCode, Population from city order by Population Asc;

# 함수
select *  from country;
select Name , IFNULL(IndepYear , "독립 연도 없음") from country;

select LOWER(Code) from country;
select UPPER(Code) as 대문자나라 from country;
select * from city;
select concat(ID, " / ", Name, " / ", Population) from city;
select * from country;
select replace(Continent, "Asia", "아시아당") from country;
select Name, CEILING(LifeExpectancy) from country;
select Name, FLOOR(LifeExpectancy) from country;
select Name, LENGTH(Name) from country;
select MAX(Population) from city;
select MIN(Population) from city;
select AVG(Population) from city;

select CountryCode , Sum(Population) from city group by CountryCode;

select co.Code, ci.Name, co.Name
from city ci
Inner Join country co on ci.CountryCode = co.Code;


select * from countrylanguage;

select co.Code, co.Name, cl.Language
from country co
left join countrylanguage cl on co.Code = cl.CountryCode where cl.Language is null;

select co.Code, co.Name, cl.Language
from country co
LEFT JOIN countrylanguage cl
on co.Code = cl.CountryCode;

# join의 함수
select ci.CountryCode, co.name, sum(ci.Population), AVG(ci.Population)
from city ci
INNER JOIN country co
ON ci.CountryCode = co.Code
group by ci.CountryCode;

select * from city;

select *
from city
where Population > (select Population from city where name = "Amsterdam");


