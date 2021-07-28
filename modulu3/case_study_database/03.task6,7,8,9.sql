use furama;

-- 6.	Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu của tất cả các loại Dịch vụ chưa từng được Khách hàng thực hiện đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).
select dv.id_dich_vu,dv.ten_dich_vu,dv.dien_tich,dv.chi_phi_thue,
       l.Ten_loai_dich_vu
from dich_vu dv
join loai_dich_vu l on l.id_loai_dich_vu=dv.id_loai_dich_vu
join hop_dong hd on hd.id_dich_vu=dv.id_dich_vu
where dv.id_dich_vu not in (select hd.id_dich_vu
						   from hop_dong hd
                           where (year(ngay_lam_hop_dong)=2019) 
                             and (month(ngay_lam_hop_dong) in (1,2,3))
                             );
                        

-- 7.	Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu của tất cả các loại dịch vụ đã từng được Khách hàng đặt phòng trong năm 2018 nhưng chưa từng được Khách hàng đặt phòng  trong năm 2019.
select dv.id_dich_vu,dv.ten_dich_vu,dv.so_nguoi_toi_da,dv.chi_phi_thue,
        l.ten_loai_dich_vu
from dich_vu dv
join loai_dich_vu l on l.id_loai_dich_vu=dv.id_loai_dich_vu
join hop_dong hd on hd.id_dich_vu=dv.id_dich_vu
where (year(hd.ngay_lam_hop_dong)=2018) 
and dv.id_dich_vu not in(select hd.id_dich_vu
                          from hop_dong hd 
                          where (year(ngay_lam_hop_dong)=2019)
                          );
                       
                       
--  8.	Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoThenKhachHang không trùng nhau.
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên
select ho_ten
from khach_hang
group by ho_ten;

select ho_ten
from khach_hang
union
select ho_ten
from khach_hang;

select distinct ho_ten
from khach_hang;

select distinctrow ho_ten
from khach_hang;
  
--   9.	Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2019 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.
 select month(ngay_lam_hop_dong) as thang, count(id_khach_hang) as so_lan_khach_dat_phong
 from hop_dong
 where year(ngay_lam_hop_dong)=2019
 group by month(ngay_lam_hop_dong);
 
                       