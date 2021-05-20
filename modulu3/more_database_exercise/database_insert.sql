create database quan_ly_thuc_tap;
use quan_ly_thuc_tap;
create table faculty(
                     faculty_id int primary key auto_increment,
                     faculty_name char(20),
                     phone char(10));
create table project(
                     project_id int primary key auto_increment,
                     project_name char(30),
                     expense int,
                     place_of_intern char(30));
create table instructor(
                        instructor_id int primary key auto_increment,
                        instructor_name char(30),
                        salary int,
                        faculty_id int,
                        foreign key (faculty_id) references faculty(faculty_id)
                        );
create table student(
                     student_id int not null primary key auto_increment,
                     student_name char(40),
                     faculty_id int,
                     date_of_birth date,
                     place_of_birth char(30),
                     foreign key (faculty_id) references faculty(faculty_id));
create table instructor_student(
                                id int primary key auto_increment,
                                student_id int,
                                project_id int,
                                instructor_id int,
                                grade int,
                                foreign key (student_id) references student(student_id),
                                foreign key (project_id) references project(project_id),
                                foreign key (instructor_id) references instructor(instructor_id));
 insert into faculty(faculty_name,phone)
        values('cong nghe sinh,hoc','0987654565'),
			  ('toan','0987678546'),
              ('dia ly','0989765674'),
              ('QLTN','0978563423');
insert into instructor(instructor_name,salary,faculty_id)
       values('tran son',10000000,1),
             ('hoang linh',12000000,1),
             ('manh trung',10000000,2),
             ('tran nga',13000000,3),
             ('thao nhi',10000000,4);
insert into student(student_name,faculty_id,date_of_birth,place_of_birth)
	   values('thuy linh',1,'2001-10-20','quang binh'),
             ('ngoc lan',2,'2000-2-2','hue'),
             ('le van son',3,'2001-10-4','da nang'),
             ('khanh ly',4,'2001-3-6','da nang'),
             ('phuong anh',null,'2000-7-3','quang tri');
insert into project(project_name,expense,place_of_intern)
	   values('cay ghep',500000,'quang binh'),
             ('tinh toan',700000,'da nang'),
             ('vung dat moi',900000,'hue');
insert into instructor_student(student_id,project_id,instructor_id,grade)
       values(1,1,1,1),
             (2,1,1,2),
             (3,2,2,1),
             (4,3,3,2);
             
              
					 
                                