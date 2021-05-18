create database demo;
use demo;
create table products(id int primary key,
                      product_code int,
                      product_name varchar(50),
                      product_price int,
                      product_amount int,
                      product_description varchar(50),
                      product_status varchar(50)
                      );
insert into products
values(1,1,"but bi",5000,2,"muc xanh","con"),
	  (2,2,"vo",10000,3,"co ke o","con"),
      (3,3,"but chi",5000,2,"mot loi","con");
      
      
--   tạo chỉ mục
create unique index index_product
on products(product_code);
alter table products
add index index_composite_product(product_name,product_price);

explain select*from products where product_description="mot_loi";
explain select* from products where id=3;

-- Tạo view
create view view_product as
select product_code,product_name,product_price,product_status
from products;
update view_product
set product_price=6000
where product_price=5000;
drop view view_product;

-- Tạo store procedure 
delimiter //
create procedure find_add_product()
begin
select * from products;
end 
// delimiter ;




delimiter //
create procedure add_product(p_id int,
                             p_code int, 
                             p_name varchar(50),
                             p_price int,
                             p_amount int,
                             p_description varchar(50),
                             p_status varchar(50))
begin
insert into products
values(p_id,p_code,p_name,p_price,p_amount,p_description,p_status);
end 
 //delimiter ;

call add_product(4,4,"sap mau",15000,3,"12 mau","con");

delimiter //
create procedure edit_product(in search_id int,
                              in p_id int,
                              in p_code int,
							  in p_name varchar(50),
                              in p_price int,
                              in p_amount int,
                              in p_description varchar(50),
							  in p_status varchar(50)
                              )
begin
update products
set id=p_id,
    product_code=p_code,
    product_name=p_name,
	product_price=p_price,
    product_amount=p_amount,
    product_description=p_description,
    product_status=p_status
where id=search_id;
end 
// delimiter ;
call edit_product(3,5,5,"but xoa",10000,5,"mau xanh","con");


delimiter //
create procedure delete_product(in p_id int)
begin
delete 
from products
where id=p_id;
end
//delimiter ;
call delete_product(5);