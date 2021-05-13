create database if not exists furama;
use furama;
create table vi_tri(
id_vi_tri int not null primary key auto_increment,
ten_vi_tri varchar(45)
);
create table trinh_do(
id_trinh_do int not null primary key auto_increment,
ten_trinh_do varchar(45)
);
create table bo_phan(
id_bo_phan int not null primary key auto_increment,
ten_bo_phan varchar(45)
);
create table dich_vu_di_kem(
id_dich_vu_di_kem int not null primary key auto_increment,
ten_dich_vu_di_kem varchar(45),
gia int not null,
don_vi int not null,
trang_thai_kha_dung varchar(45)
);
create table loai_khach(
id_loai_khach int not null primary key auto_increment,
ten_loai_khach varchar(45)
);
create table loai_dich_vu(
id_loai_dich_vu int not null primary key auto_increment,
ten_loai_dich_vu varchar(45)
);
create table kieu_thue(
id_kieu_thue int not null primary key auto_increment,
ten_kieu_thue varchar(45),
gia int not null
);
create table nhan_vien(
id_nhan_vien int not null primary key auto_increment,
ho_ten varchar(45),
id_vi_tri int,
id_trinh_do int,
id_bo_phan int,
ngay_sinh date,
so_cmnd varchar(45),
luong varchar(45),
sdt varchar(45),
email varchar(45),
dia_chi varchar(45),
foreign key (id_vi_tri) references vi_tri(id_vi_tri),
foreign key (id_trinh_do) references trinh_do(id_trinh_do),
foreign key (id_bo_phan) references bo_phan(id_bo_phan)
);
create table khach_hang(
id_khach_hang int not null primary key auto_increment,
id_loai_khach int,
ho_ten varchar(45),
ngay_sinh date,
so_cmnd varchar(45),
sdt varchar(45),
email varchar(45),
dia_chi varchar(45),
foreign key (id_loai_khach) references loai_khach(id_loai_khach)
);
create table dich_vu(
id_dich_vu int not null primary key auto_increment,
ten_dich_vu varchar (45),
Dien_tich int not null,
so_tang int not null,
so_nguoi_toi_da int not null,
chi_phi_thue varchar(45),
id_kieu_thue int,
id_loai_dich_vu int,
trang_thai varchar(45),
foreign key (id_kieu_thue) references kieu_thue(id_kieu_thue),
foreign key (id_loai_dich_vu) references loai_dich_vu(id_loai_dich_vu)
);
create table hop_dong(
id_hop_dong int not null primary key auto_increment,
id_nhan_vien int,
id_khach_hang int,
id_dich_vu int,
ngay_lam_hop_dong date,
ngay_ket_thuc date,
tien_coc int not null,
tong_tien int not null,
foreign key (id_nhan_vien) references nhan_vien(id_nhan_vien),
foreign key (id_khach_hang) references khach_hang(id_khach_hang),
foreign key (id_dich_vu) references dich_vu(id_dich_vu)
);
create table hop_dong_chi_tiet(
id_hop_dong_chi_tiet int not null primary key auto_increment,
id_hop_dong int,
id_dich_vu_di_kem int,
so_luong int,
foreign key (id_dich_vu_di_kem) references dich_vu_di_kem(id_dich_vu_di_kem),
foreign key(id_hop_dong) references hop_dong(id_hop_dong)
);
select * from vi_tri;
insert into vi_tri (ten_vi_tri)
values("giam doc"),("quan ly"),("giam sat"),("chuyen vien"),("phuc vu"),("le tan");
select * from trinh_do;
 insert into trinh_do (ten_trinh_do)
 values("tien si"),("thac si"),("dai hoc"),("cao dang"),("trung cap");
select * from bo_phan;
insert into bo_phan (ten_bo_phan)
values ("quan ly"),("hanh chinh"),("phuc vu"),("sele-marketing");
insert into nhan_vien(ho_ten,id_vi_tri,id_trinh_do,id_bo_phan,ngay_sinh,so_cmnd,luong,sdt,email,dia_chi)
values("nga",2,3,1,"1997-10-20","201201022","12000000","0978654567","nga97@gmail.com","da nang"),
("trang",3,3,2,"1997-12-03","201201022","10000000","0897654378","trang109@gmai.com","dong nai"),
("hung",1,1,1,"1990-03-2","201201022","20000000","0903567890","hung123@gmail.com","hue");

select * from nhan_vien;
select * from loai_dich_vu;
insert into loai_dich_vu(ten_loai_dich_vu)
values("villa"),("house"),("room");
select * from loai_khach;
insert into loai_khach(ten_loai_khach)
values ("vip"),("binh thuong");
select * from kieu thue;
insert into kieu_thue(ten_kieu_thue,gia)
values("ngay",1200000),("thang",15000000),("nam",25000000),("gio",200000);
 select * from dich_vu;
 insert into dich_vu(ten_dich_vu,dien_tich,so_tang,so_nguoi_toi_da,chi_phi_thue,id_kieu_thue,id_loai_dich_vu,trang_thai)
 values("bana hill",500,2,6,"15000000",1,1,"con"),
 ("the garder",100,2,4,"15000000",2,2,"con"),
 ("dana",60,1,2,"120000",1,3,"con");
select * from dich_vu_di_kem;
insert into dich_vu_di_kem(ten_dich_vu_di_kem,gia,don_vi,trang_thai_kha_dung)
values("karaok",200000,1,"con"),("bua trua",200000,2,"con"),("thue xe",100000,2,"con");
select * from khach_hang;
insert into khach_hang(id_loai_khach,ho_ten,ngay_sinh,so_cmnd,sdt,email,dia_chi)
values (1,"thoa","1995-05-04","192435678","0987654678","thao45@gmail.com","da nang"),
(2,"linh","1998-08-12","194567892","0987564356","linh23@gmaile.com","hue"),
(1,"trung","1996-04-20","194523456","0987652431","trung12@gmail.com","quang binh");
select *from hop_dong;
insert into hop_dong(id_nhan_vien,id_khach_hang,id_dich_vu,ngay_lam_hop_dong,ngay_ket_thuc,tien_coc,tong_tien)
values(1,1,1,"2019-12-3","2022-02-2",5000000,0),
(1,2,2,"2020-3-12","2022-02-2",5000000,0),
(1,3,1,"2015-5-5","2022-02-2",5000000,0);
select * from hop_dong_chi_tiet;
insert into hop_dong_chi_tiet(id_hop_dong,id_dich_vu_di_kem,so_luong)
values (1,1,1),(2,2,1);
