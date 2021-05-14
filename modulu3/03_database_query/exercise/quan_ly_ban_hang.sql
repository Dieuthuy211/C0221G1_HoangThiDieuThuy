use quan_ly_ban_hang;
insert into  customer(name_customer,age)
values("Minh Quan",10),
("Ngoc Oanh",20),
("Hong Ha",50);

insert into `order`(id_customer,date_order)
values(1,"2006/3/21"),
(2,"2006/3/23"),
(1,"2006/3/16");

insert into product(name_product,price)
values("May giat",3),
("Tu lanh",5),
("Dieu hoa",7),
("Quat",1),
("Bep dien",2);

insert into orderdetail(id_order,id_product,oqty)
values(1,1,3),
(1,3,7),
(1,4,2),
(2,1,1),
(3,1,8),
(2,5,4),
(2,3,3);
-- vd so_luong*don_gia as tong_tien
-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
select `order`.id_order,`order`.date_order,`order`.total_price 
from `order`;

-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
 select c.id_customer,c.name_customer,p.name_product
 from orderdetail ot
  left join `order` od on od.id_order=ot.id_order
  left join product p on p.id_product=ot.id_product
  left join customer c on c.id_customer=ot.id_order;
  
  -- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
  select  *
  from  customer c
  left join `order` od on od.id_customer=c.id_customer
  where od.id_order is null;
  
  -- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn (giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất hiện trong hóa đơn. Giá bán của từng loại được tính = odQTY*pPrice)
  select od.id_order,od.date_order, sum(ot.oqty*p.price) as total
  from `order` od
  left join orderDetail ot on ot.id_order=od.id_order
  left join product p on p.id_product=ot.id_product
  group by od.id_order;