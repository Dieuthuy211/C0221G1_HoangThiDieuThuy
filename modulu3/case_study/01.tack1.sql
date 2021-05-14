use furama;
insert into vi_tri (ten_vi_tri)
values("giam doc"),
       ("quan ly"),
       ("giam sat"),
       ("chuyen vien"),
       ("phuc vu"),
       ("le tan");

 insert into trinh_do (ten_trinh_do)
 values("tien si"),
	  ("thac si"),
      ("dai hoc"),
      ("cao dang"),
      ("trung cap");

insert into bo_phan (ten_bo_phan)
values ("quan ly"),
      ("hanh chinh"),
      ("phuc vu"),
      ("sele-marketing");
      
insert into nhan_vien(ho_ten,id_vi_tri,id_trinh_do,id_bo_phan,ngay_sinh,so_cmnd,luong,sdt,email,dia_chi)
values("Tran Nga",2,3,1,"1997-10-20","190765432","12000000","0978654567","nga97@gmail.com","da nang"),
("Phuong Trang",3,3,2,"1997-12-03","190876547","10000000","0897654378","trang109@gmai.com","dong nai"),
("Thanh Hung",1,1,1,"1990-03-2","195278654","20000000","0903567890","hung123@gmail.com","hue"),
("khang",5,4,3,"1992-04-17","198765432","5000000","0987653452","khang10@gmail.com","quang binh"),
("Thanh Thuy",6,4,3,"1997-02-09","190765432","6000000","0987678576","thuy12@gmail.com","quang binh");


insert into loai_dich_vu(ten_loai_dich_vu)
values("cao cap"),
      ("binh thuong");

insert into loai_khach(ten_loai_khach)
values ("cao cap"),
       ("binh thuong");

insert into kieu_thue(ten_kieu_thue,gia)
values("nam",100000000),
	  ("thang",1000000 ),
      ("ngay",100000),
      ("gio",100000);
 
 insert into dich_vu(ten_dich_vu,dien_tich,so_tang,so_nguoi_toi_da,chi_phi_thue,id_kieu_thue,id_loai_dich_vu,trang_thai)
 values("villa",500,3,6,"15000000",1,1,"con"),
       ("house",100,2,4,"10000000",2,2,"con"),
       ("room",60,3,2,"1200000",3,2,"con");
      

insert into dich_vu_di_kem(ten_dich_vu_di_kem,gia,don_vi,trang_thai_kha_dung)
values("karaok",200000,1,"con"),
       ("bua trua",200000,2,"con"),
       ("thue xe",100000,2,"con");

insert into khach_hang(id_loai_khach,ho_ten,ngay_sinh,so_cmnd,sdt,email,dia_chi)
values (1,"thoa","1995-05-04","192435678","0987654678","thao45@gmail.com","da nang"),
       (2,"linh","1998-08-12","194567892","0987564356","linh23@gmaile.com","hue"),
       (1,"trung","1996-04-20","194523456","0987652431","trung12@gmail.com","quang binh"),
       (2,"anh","2006-5-14",0,0,0,"quang tri"),
       (2,"yen","1973-9-3","190897654","0987656743","yen123@gmail.com","quang tri");
       

insert into hop_dong(id_nhan_vien,id_khach_hang,id_dich_vu,ngay_lam_hop_dong,ngay_ket_thuc,tien_coc,tong_tien)
values(1,null,null,"2018-2-3","2020-2-3",0,0),
      (2,null,null,"2017-6-3","2019-3-3",0,0),
      (3,null,null,"2019-2-4","2021-2-4",0,0),
      (4,null,null,"2018-2-7","2020-2-7",0,0),
      (null,1,1,"2018-3-2","2018-3-2",50000000,0),
      (null,2,2,"2019-10-1","2019-11-1",5000000,0),
      (null,3,1,"2017-12-1","2018-12-1",20000000,0),
      (null,4,3,"2020-2-2","2020-2-3",200000,0);
      

insert into hop_dong_chi_tiet(id_hop_dong,id_dich_vu_di_kem,so_luong)
values (5,1,1),
	   (6,2,1),
       (7,3,1);
       
