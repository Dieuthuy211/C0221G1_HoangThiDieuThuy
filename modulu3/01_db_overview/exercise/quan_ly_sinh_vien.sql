create database quan_ly_sinh_vien;
use quan_ly_sinh_vien;
create table class(
id_class int not null primary key auto_increment,
name_class varchar(50)
);
select* from class;
insert into class (name_class)
values("C0221G1"),
("C0321G1");
create table teacher(
id_teacher int not null primary key auto_increment,
name_teacher varchar(50),
age int,
country varchar(50)
);
select* from teacher;
insert into teacher (name_teacher,age,country)
values("tien",28,"da nang"),
("chanh",30,"quang nam"),
("chien",23,"quang binh");
