create database quan_ly_vat_tu;
use quan_ly_vat_tu;
create table nha_cung_cap(
ma_nha_cung_cap int not null primary key,
ten_nha_cung_cap varchar(50),
dia_chi varchar (50),
sdt int(10)
);
create table phieu_nhap(
ma_phieu_nhap int not null primary key,
ngay_nhap date
);
create table phieu_xuat(
ma_phieu_xuat int not null primary key,
ngay_xuat date 
);
create table vat_tu(
ma_vat_tu int not null primary key,
ten_vat_tu varchar(50)
);
create table phieu_xuat_vat_tu(
ma_phieu_xuat int,
ma_vat_tu int,
don_gia_xuat int,
so_luong_xuat int,
primary key (ma_phieu_xuat,ma_vat_tu),
foreign key (ma_phieu_xuat) references phieu_xuat(ma_phieu_xuat),
foreign key (ma_vat_tu) references vat_tu(ma_vat_tu)
);
create table phieu_nhap_vat_tu(
ma_phieu_nhap int,
ma_vat_tu int,
don_gia_nhap int,
so_luong_nhap int,
primary key(ma_phieu_nhap,ma_vat_tu),
foreign key (ma_phieu_nhap) references phieu_nhap(ma_phieu_nhap),
foreign key(ma_vat_tu) references vat_tu(ma_vat_tu)
);
create table don_dat_hang(
ma_don_hang int not null primary key,
ma_nha_cung_cap int,
ngay_dat_hang date,
foreign key (ma_nha_cung_cap) references nha_cung_cap(ma_nha_cung_cap)
);
create table don_dat_hang_vat_tu(
ma_don_hang int,
ma_vat_tu int,
primary key (ma_don_hang,ma_vat_tu),
foreign key (ma_don_hang) references don_dat_hang(ma_don_hang),
foreign key (ma_vat_tu) references vat_tu(ma_vat_tu)
);

