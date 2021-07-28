use furama;


-- 10.	Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm. Kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem (được tính dựa trên việc count các IDHopDongChiTiet).
select hd.id_hop_dong, hd.ngay_lam_hop_Dong,hd.ngay_ket_thuc,
count(id_dich_vu_di_kem) as so_luong_dich_vu_di_kem
from hop_dong hd
join hop_dong_chi_tiet dt on dt.id_hop_dong=hd.id_hop_dong
group by dt.id_hop_dong;
       
-- 11.	Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hàng có TenLoaiKhachHang là “Diamond” và có địa chỉ là “Vinh” hoặc “Quảng Ngãi”.
select k.id_khach_hang,k.dia_chi,
       lk.ten_loai_khach,
       dk.ten_dich_vu_di_kem
from khach_hang k
join loai_khach lk on lk.id_loai_khach=k.id_loai_khach
join hop_dong hd on hd.id_khach_hang = k.id_khach_hang
join hop_dong_chi_tiet ht on ht.id_hop_dong=hd.id_hop_dong
join dich_vu_di_kem dk on dk.id_dich_vu_di_kem=ht.id_dich_vu_di_kem
where lk.ten_loai_khach="Diamond"
and k.dia_chi in ("Vinh" ,"Quang Ngai");

-- 12.	Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, TenDichVu, SoLuongDichVuDikem (được tính dựa trên tổng Hợp đồng chi tiết), TienDatCoc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2019 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019.
select hd.id_hop_dong,hd.tien_coc,
       n.ho_ten as ten_nhan_vien,
       k.ho_ten as ten_khach_hang,k.sdt as sdt_khach_hang,
       dv.ten_dich_vu,
       count(id_dich_vu_di_kem) as so_luong_dich_vu_di_kem
from hop_dong hd
join nhan_vien n on n.id_nhan_vien= hd.id_hop_dong
join khach_hang k on k.id_khach_hang=hd.id_khach_hang
join dich_vu dv on dv.id_dich_vu=hd.id_dich_vu
join hop_dong_chi_tiet ht on ht.id_hop_dong =hd.id_hop_dong
where (hd.ngay_lam_hop_dong between 2019-10-1 and 2019-12-31)
and dv.id_dich_vu   not in( select hd.id_dich_vu
							from hop_dong hd
							where hd.ngay_lam_hop_dong between 2019-1-1 and 2019-6-30)
group by ht.id_hop_dong_chi_tiet ;
  
     