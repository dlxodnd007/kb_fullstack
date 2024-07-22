-- 고객 테이블 생성
create table customers (
	customer_id int primary key,
    customer_name varchar(10)
);

-- 주문 테이블 생성
create table orders (
	order_id int primary key,
    customer_id int,
    order_date date,
    foreign key (customer_id) references customers(customer_id)
);

-- 카테고리 테이블 생성
create table categories(
	category_id int primary key,
    category_name varchar(100)
);

-- 상품 테이블 생성
create table products(
	product_id int primary key,
    product_name varchar(100),
    product_price int,
    category_id int,
    foreign key (category_id) references categories(category_id)
);

-- 주문 상세 테이블 생성
create table oreder_details (
	order_id int,
    product_id int,
    quantity int,
    foreign key (order_id) references orders(order_id),
    foreign key (product_id) references products(product_id)
);

-- 데이터베이스 사용
USE mydb;

-- 고객 테이블 생성
CREATE TABLE customers (
    customer_id INT PRIMARY KEY,
    customer_name VARCHAR(100) 
);

-- 주문 테이블 생성
CREATE TABLE orders (
    order_id INT PRIMARY KEY,
    customer_id INT,
    order_date DATE,
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
);

-- 카테고리 테이블 생성
CREATE TABLE categories (
    category_id INT PRIMARY KEY,
    category_name VARCHAR(100)
);

-- 상품 테이블 생성
CREATE TABLE products (
    product_id INT PRIMARY KEY,
    product_name VARCHAR(100),
    product_price INT,
    category_id INT,
    FOREIGN KEY (category_id) REFERENCES categories(category_id)
);

-- 주문 상세 테이블 생성
CREATE TABLE order_details (
    order_id INT,
    product_id INT,
    quantity INT,
    FOREIGN KEY (order_id) REFERENCES orders(order_id),
    FOREIGN KEY (product_id) REFERENCES products(product_id)
);

-- 고객 테이블에 데이터 삽입
INSERT INTO customers (customer_id, customer_name) VALUES
(1, '김시완'),
(2, '이효석'),
(3, '김연비'),
(4, '최호진'),
(5, '김동준'),
(6, '최현수'),
(7, '권오현');

select * from customers;

-- 카테고리 테이블에 데이터 삽입
INSERT INTO categories (category_id, category_name) VALUES
(1, '전자기기'),
(2, '주변기기');

select * from categories;

-- 상품 테이블에 데이터 삽입
INSERT INTO products (product_id, product_name, product_price, category_id) VALUES
(1, '맥북에어', 650000, 1),
(2, '맥북프로', 700000, 1),
(3, '맥북프로맥스', 750000, 1),
(4, '맥북파우치', 10000, 2),
(5, 'DT-35키보드', 20000, 2),
(6, '독거미키보드', 50000, 2);

select * from products;

-- 주문 테이블에 데이터 삽입
INSERT INTO orders (order_id, customer_id, order_date) VALUES
(1, 1, '2024-06-01'),
(2, 2, '2023-06-02'),
(3, 3, '2023-06-03'),
(4, 4, '2023-06-04'),
(5, 5, '2023-06-05'),
(6, 6, '2023-06-06'),
(7, 7, '2023-06-07');

select * from orders;

-- 주문 상세 테이블에 데이터 삽입
INSERT INTO order_details (order_id, product_id, quantity) VALUES
(1, 1, 1),
(1, 4, 1),
(2, 2, 1),
(3, 3, 1),
(4, 5, 1),
(5, 6, 1),
(6, 6, 1),
(7, 6, 1);

-- customer 테이블과 orders 테이블 합치기
select *
from customers c
inner join orders o ON c.customer_id = o.customer_id
inner join order_details od ON o.order_id = od.order_id
inner join products p ON od.product_id = p.product_id
inner join categories cat ON p.category_id = cat.category_id;

-- 사용자별 
select customer_name, SUM(p.product_price * od.quantity) as 총액
from customers c
inner join orders o ON c.customer_id = o.customer_id
inner join order_details od ON o.order_id = od.order_id
inner join products p ON od.product_id = p.product_id
group by c.customer_name
order by 총액 desc;


-- 각 뭎품이 몇개 팔렸나
select p.product_name, sum(od.quantity) as 총판매수
from products p
inner join order_details od
on p.product_id = od.product_id
group by p.product_name 
order by 총판매수 desc;


