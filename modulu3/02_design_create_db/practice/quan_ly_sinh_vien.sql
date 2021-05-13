create database quan_ly_sinh_vien;
use quan_ly_sinh_vien;
create table class(
id_class int not null primary key auto_increment,
class_name varchar(60) not null,
Start_data datetime not null,
`status` bit
);
create table student(
id_student int not null primary key auto_increment,
student_name varchar(30)not null,
address varchar(30),
phone varchar(20),
`status` bit,
id_class int,
foreign key (id_class) references class(id_class)
);
create table `subject`(
id_sub int not null primary key auto_increment,
sub_name varchar (30) not null,
credit tinyint not null  default 1 check(credit>=1),
 `status` bit default 1
);
create table mark(
id_mark int not null primary key auto_increment,
id_sub int not null,
id_student int not null,
mark float default 0 check( mark between 0 and 100),
unique(id_sub,id_student),
foreign key (id_sub) references `subject`(id_sub),
foreign key (id_student) references student(id_student)
);
