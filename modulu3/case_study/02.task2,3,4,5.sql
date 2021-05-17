use furama;
-- 2.	Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự.
select *
from nhan_vien
where (ho_ten like "k%" or ho_ten like "H%" or ho_ten like"T%")
 and (char_length(ho_ten)<16);

-- 3.	Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
select *
from khach_hang
where  ((2021-year(ngay_sinh))>=18 
and (2021-year(ngay_sinh))<=50) 
and (dia_chi="da nang" or dia_chi="quang tri" );


-- 4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
select k.id_khach_hang,k.ho_Ten ,count(id_hop_dong) as dat_phong
from khach_hang k
left join hop_dong hp on hp.id_khach_hang=k.id_khach_hang
left join loai_khach lk on lk.id_loai_khach=k.id_loai_khach
where id_hop_dong is not null and
lk.ten_loai_khach="Diamond" 
group by id_hop_dong
order by dat_phong;


-- 5.	Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, TongTien (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, với SoLuong và Giá là từ bảng DichVuDiKem) cho tất cả các Khách hàng đã từng đặt phỏng. (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).
select k.id_khach_hang,k.ho_ten,
lk.ten_loai_khach,
hd.id_hop_dong,hd.ngay_lam_hop_dong,hd.ngay_ket_thuc,
dv.ten_dich_vu,
sum(dv.chi_phi_thue+dt.so_luong*dk.gia) as tong_tien
from  hop_dong hd
left join khach_hang k on k.id_khach_hang=hd.id_hop_dong
left join hop_dong_chi_tiet ht on ht.id_hop_dong=hd.id_hop_dong
left join dich_vu dv on dv.id_dich_vu=hd.id_dich_vu
left join loai_khach lk on lk.id_loai_khach=k.id_loai_khach
left join dich_vu_di_kem dk on dk.id_dich_vu_di_kem=ht.id_dich_vu_di_kem
group by id_hop_dong;



