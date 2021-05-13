create database quan_ly_ban_hang;
use quan_ly_ban_hang;
create table customer(
id_customer int not	null primary key auto_increment,
name_customer varchar(50),
age int
);
create table product(
id_product int not null primary key auto_increment,
name_product varchar(50),
price int
);
create table `order`(
id_order  int not null primary key auto_increment,
id_customer int,
date_order date,
total_price int,
foreign key (id_customer) references customer(id_customer)
); 
create table orderdetail(
id_order  int,
id_product int,
oqty varchar(50),
primary key(id_order,id_product),
foreign key (id_order) references `order`(id_order),
foreign key (id_product) references product(id_product)
);