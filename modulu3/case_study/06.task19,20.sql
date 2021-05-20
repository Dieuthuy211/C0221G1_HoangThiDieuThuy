use furama;
-- 19.	Cập nhật giá cho các Dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2019 lên gấp đôi.
update dich_vu_di_kem dk
set dich_vu_di_kem.gia=gia*2
where dk.id_dich_vu_di_kem  in (select ht.id_dich_vu_di_kem
								from  hop_dong hd
								join hop_dong_chi_tiet ht on hd.id_hop_dong=ht.id_hop_dong
								where year(hd.ngay_lam_hop_dong) =2019
								group by ht.id_dich_vu_di_kem
								having sum(so_luong)>10 );
-- 	20.	Hiển thị thông tin của tất cả các Nhân viên và Khách hàng có trong hệ thống, thông tin hiển thị bao gồm ID (IDNhanVien, IDKhachHang), HoTen, Email, SoDienThoai, NgaySinh, DiaChi.
select n.id_nhan_vien as id,n.ho_ten ,n.email,n.sdt ,n.ngay_sinh ,n.dia_chi 
from nhan_vien n
union all
select  k.id_khach_hang,k.ho_ten ,k.email ,k.sdt,k.ngay_sinh, k.dia_chi
from khach_hang k;
	  

       

