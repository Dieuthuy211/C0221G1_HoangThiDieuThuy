use furama;

-- 21.	Tạo khung nhìn có tên là V_NHANVIEN để lấy được thông tin của tất cả các nhân viên có địa chỉ là “Hải Châu” và đã từng lập hợp đồng cho 1 hoặc nhiều Khách hàng bất kỳ  với ngày lập hợp đồng là “12/12/2019”
create view v_nhan_vien as
select*
from nhan_vien
where dia_chi="hai chau" 
and id_nhan_vien in(select id_nhan_vien
                    from hop_dong
                    where ngay_lam_hop_dong="2019-12-12");
                    
                    
-- 22.	Thông qua khung nhìn V_NHANVIEN thực hiện cập nhật địa chỉ thành “Liên Chiểu” đối với tất cả các Nhân viên được nhìn thấy bởi khung nhìn này.
SET SQL_SAFE_UPDATES = 0;
update v_nhan_vien
set dia_chi="lien chieu";                    
  
--   23.	Tạo Store procedure Sp_1 Dùng để xóa thông tin của một Khách hàng nào đó với Id Khách hàng được truyền vào như là 1 tham số của Sp_1
delimiter //
create procedure delete_khach_hang(in p_id int)
begin
delete 
from khach_hang
where id_khach_hang=p_id;
end
//delimiter ;

-- 24.	Tạo Store procedure Sp_2 Dùng để thêm mới vào bảng HopDong với yêu cầu Sp_2 phải thực hiện kiểm tra tính hợp lệ của dữ liệu bổ sung, với nguyên tắc không được trùng khóa chính và đảm bảo toàn vẹn tham chiếu đến các bảng liên quan.-
delimiter //
create procedure add_hop_dong(in search_id int,
                              in p_id_nhan_vien int,
                              in p_id_khach_hang int,
                              in p_id_dich_vu int,
                              in p_ngay_lam_hop_dong date,
                              in P_ngay_ket_thuc date,
                              in p_tien_coc int,
                              in P_tong_tien int)
                             
 begin   
     if p_id_nhan_vien in(select id_nhan_vien from nhan_vien)
     and p_id_khach_hang in(select id_khach_hang from khach_hang)
     and p_id_dich_vu in(select id_dich_vu from dich_vu)
	 then insert into hop_dong (id_nhan_vien,
                                id_khach_hang,
                                id_dich_vu,
                                ngay_lam_hop_dong,
                                ngay_ket_thuc,tien_coc,
                                tong_tien)
					values(p_id_nhan_vien ,
                           p_id_khach_hang,
                           p_id_dich_vu,
                           p_ngay_lam_hop_dong,
                           P_ngay_ket_thuc,p_tien_coc,
                           P_tong_tien);
     end if;
end
//delimiter ;



-- 25.	Tạo triggers có tên Tr_1 Xóa bản ghi trong bảng HopDong thì hiển thị tổng số lượng bản ghi còn lại có trong bảng HopDong ra giao diện console của database
create table tong_hop_dong(so_luong int);
delimiter //
create trigger tr_1
after delete
on hop_dong for each row
begin
declare so_luong int;
select count(id_hop_dong)
into so_luong from  hop_dong;
insert into tong_hop_dong
values (so_luong);
end
//delimiter ;
delete from hop_dong where id_hop_dong=1;
select*from tong_hop_dong;

-- 26.	Tạo triggers có tên Tr_2 Khi cập nhật Ngày kết thúc hợp đồng, cần kiểm tra xem thời gian cập nhật có phù hợp hay không, với quy tắc sau: Ngày kết thúc hợp đồng phải lớn hơn ngày làm hợp đồng ít nhất là 2 ngày. Nếu dữ liệu hợp lệ thì cho phép cập nhật, nếu dữ liệu không hợp lệ thì in ra thông báo “Ngày kết thúc hợp đồng phải lớn hơn ngày làm hợp đồng ít nhất là 2 ngày” trên console của database
alter table tong_hop_dong add ngay date;
delimiter //
create trigger tr_4
before update
on hop_dong for each row
begin
declare new_ngay_ket_thuc date;
update hop_dong
set ngay_ket_thuc=new_ngay_ket_thuc
where datediff(new_ngay_ket_thuc,ngay_lam_hop_dong)>=2;
   if  datediff(new_ngay_ket_thuc,ngay_lam_hop_dong)<=2
   then
   SIGNAL SQLSTATE '02000' SET MESSAGE_TEXT = 'Ngày kết thúc hợp đồng phải lớn hơn ngày làm hợp đồng ít nhất là 2 ngày';
    end if;
end
//delimiter ;

update hop_dong
set ngay_ket_thuc='2019-2-3';


-- 27.	Tạo user function thực hiện yêu cầu sau:
-- a.	Tạo user function func_1: Đếm các dịch vụ đã được sử dụng với Tổng tiền là > 2.000.000 VNĐ.
delimiter //
create function func_1()
returns int
deterministic
begin
return 
(select so_lan from (select count(hd.id_hop_dong) as so_lan
from hop_dong hd
join dich_vu dv on dv.id_dich_vu=hd.id_dich_vu
join hop_dong_chi_tiet ht on ht.id_hop_dong=hd.id_hop_dong
join dich_vu_di_kem dk on dk.id_dich_vu_di_kem=ht.id_dich_vu_di_kem
having sum(dv.chi_phi_thue +dk.gia*ht.so_luong)  > 2000000) as nv);
end 
// delimiter ;
drop function func_1;
select func_1();

-- b.	Tạo user function Func_2: Tính khoảng thời gian dài nhất tính từ lúc bắt đầu làm hợp đồng đến lúc kết thúc hợp đồng mà Khách hàng đã thực hiện thuê dịch vụ (lưu ý chỉ xét các khoảng thời gian dựa vào từng lần làm hợp đồng thuê dịch vụ, không xét trên toàn bộ các lần làm hợp đồng). Mã của Khách hàng được truyền vào như là 1 tham số của function này.

delimiter //
create function func_2(search_id_khach_hang int)
returns int
deterministic
begin 
return 
(select max(datediff(hd.ngay_ket_thuc,hd.ngay_lam_hop_dong))
from khach_hang k
inner join hop_dong hd  on k.id_khach_hang=hd.id_khach_hang
inner join dich_vu dv on hd.id_dich_vu=dv.id_dich_vu
where k.id_khach_hang = search_id_khach_hang);
end 
// delimiter ;
select func_2(2);	   


-- 28.	Tạo Store procedure Sp_3 để tìm các dịch vụ được thuê bởi khách hàng với loại dịch vụ là “Room” từ đầu năm 2015 đến hết năm 2019 để xóa thông tin của các dịch vụ đó (tức là xóa các bảng ghi trong bảng DichVu) và xóa những HopDong sử dụng dịch vụ liên quan (tức là phải xóa những bản gi trong bảng HopDong) và những bản liên quan khác.
