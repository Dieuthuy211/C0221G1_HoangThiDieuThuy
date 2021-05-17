use furama;

-- 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2017 đến năm 2019.
SET FOREIGN_KEY_CHECKS=0;
SET SQL_SAFE_UPDATES = 0;
delete 
from nhan_vien 
where nhan_vien.id_nhan_vien not in (select hop_dong.id_nhan_vien
                                     from hop_dong
                                     where (year(ngay_lam_hop_dong) between 2017 and 2019));
                       
SET FOREIGN_KEY_CHECKS=1;


-- 17.	Cập nhật thông tin những khách hàng có TenLoaiKhachHang từ  Platinium lên Diamond, chỉ cập nhật những khách hàng đã từng đặt phòng với tổng Tiền thanh toán trong năm 2019 là lớn hơn 10.000.000 VNĐ.
update khach_hang 
set khach_hang.id_loai_khach =1
where khach_hang.id_khach_hang in(select hd.id_khach_hang
						 from hop_dong hd
                         join dich_vu dv on dv.id_dich_vu=hd.id_dich_vu
						 join hop_dong_chi_tiet ht on ht.id_hop_dong=hd.id_hop_dong
						 join dich_vu_di_kem dk on dk.id_dich_vu_di_kem=ht.id_dich_vu_di_kem
						 where year(hd.ngay_lam_hop_dong)=2019
						 group by hd.id_khach_hang
                         having sum(dv.chi_phi_thue+ht.so_luong*dk.gia)>10000000)
                         and khach_hang.id_loai_khach = 2;
                         
-- 18.	Xóa những khách hàng có hợp đồng trước năm 2016 (chú ý ràngbuộc giữa các bảng).                         

SET FOREIGN_KEY_CHECKS=0;
SET SQL_SAFE_UPDATES = 0;
delete 
from khach_hang
where khach_hang.id_khach_hang not in (select hop_dong.id_khach_hang
									   from hop_dong
                                       where (year(ngay_lam_hop_dong)<=2016));
                       
SET FOREIGN_KEY_CHECKS=1;