use furama;


-- 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).
select  k.ho_ten,
       count(id_dich_vu_di_kem) as so_luong_dich_vu_di_kem
from khach_hang k
join hop_dong hd on hd.id_khach_hang=k.id_khach_hang
join hop_dong_chi_tiet ht on ht.id_hop_dong=hd.id_hop_dong
group by ht.id_dich_vu_di_kem
having max(so_luong_dich_vu_di_kem);

-- 14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. Thông tin hiển thị bao gồm IDHopDong, TenLoaiDichVu, TenDichVuDiKem, SoLanSuDung.
select hd.id_Hop_dong,
       lv.ten_loai_dich_vu,
       dk.ten_dich_vu_di_kem,
        count(*) as so_luong_dich_vu_di_kem
from hop_dong hd
join dich_vu dv on dv.id_dich_vu=hd.id_dich_vu
join loai_dich_vu lv on lv.id_loai_dich_vu=dv.id_loai_dich_vu
join hop_dong_chi_tiet ht on ht.id_hop_dong=hd.id_hop_dong
join dich_vu_di_kem dk on dk.id_dich_vu_di_kem=ht.id_dich_vu_di_kem
group by id_dich_vu_di_kem 
having so_luong_dich_vu_di_kem=1;     
	 

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

