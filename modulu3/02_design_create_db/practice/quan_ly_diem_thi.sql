create database quan_ly_diem_thi;
use quan_ly_diem_thi;

create table hoc_sinh(
ma_hoc_sinh varchar(20) primary key,
ten_hoc_sinh varchar(50),
ngay_sinh date,
lop varchar(20),
gioi_tinh varchar(20)
);
create table giao_vien(
Ma_giao_vien varchar(20) primary key,
ten_giao_vien varchar(50),
sdt varchar(10)
);
create table mon_hoc(
ma_mon_hoc varchar(20) primary key,
ma_hoc_sinh varchar(20),
ma_giao_vien varchar(20),
foreign key (ma_hoc_sinh) references hoc_sinh(ma_hoc_sinh),
foreign key(ma_giao_vien) references giao_vien(ma_giao_vien)
);
create table bang_diem(
ma_hoc_sinh varchar(20),
ma_mon_hoc varchar(20),
diem_thi int not null,
ngay_kien_tra datetime,
primary key (ma_hoc_sinh,Ma_mon_hoc),
foreign key (ma_hoc_sinh) references hoc_sinh(ma_hoc_sinh),
foreign key (ma_mon_hoc)  references mon_hoc(ma_mon_hoc)

);
