use furama;


-- 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).
select ten_dich_vu_di_kem,gia,max(so_lan_su_dung) 
from  (select dk.ten_dich_vu_di_kem,dk.gia,dk.don_vi,sum(ht.so_luong) as so_lan_su_dung
      from dich_vu_di_kem dk
	  inner join hop_dong_chi_tiet ht on dk.id_dich_vu_di_kem = ht.id_dich_vu_di_kem
      inner join hop_dong hd on hd.id_hop_dong = ht.id_hop_dong
	  group by dk.ten_dich_vu_di_kem)So_lan_su_dung;
      

-- 14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. Thông tin hiển thị bao gồm IDHopDong, TenLoaiDichVu, TenDichVuDiKem, SoLanSuDung.   
select ten_dich_vu_di_kem,gia,tong_so
from  (select dk.ten_dich_vu_di_kem,dk.gia,dk.don_vi,sum(ht.so_luong) as so_lan_su_dung
      from dich_vu_di_kem dk
	  inner join hop_dong_chi_tiet ht on dk.id_dich_vu_di_kem = ht.id_dich_vu_di_kem
      inner join hop_dong hd on hd.id_hop_dong = ht.id_hop_dong
	  group by dk.ten_dich_vu_di_kem)so_lan_su_dung
where so_lan_su_dung=1;


-- 15.	Hiển thi thông tin của tất cả nhân viên bao gồm IDNhanVien, HoTen, TrinhDo, TenBoPhan, SoDienThoai, DiaChi mới chỉ lập được tối đa 3 hợp đồng từ năm 2018 đến 2019.
select n.id_nhan_vien,n.ho_ten,n.sdt,n.dia_chi,
       t.ten_trinh_do,
       b.ten_bo_phan,
      count(*) as so_luong_lap
from nhan_vien n
join hop_dong hd on hd.id_nhan_vien=n.id_nhan_vien
join trinh_do t on t.id_trinh_do=n.id_trinh_do
join bo_phan b on b.id_bo_phan=n.id_bo_phan
where (year(ngay_lam_hop_dong) in (2018,2019))
group by id_nhan_vien
having so_luong_lap<4 ;

