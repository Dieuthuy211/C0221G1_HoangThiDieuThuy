use quan_ly_thuc_tap;
-- 1.	Đưa ra thông tin gồm mã số, họ tên và tên khoa của tất cả các giảng viên
select instructor.instructor_id,instructor.instructor_name,faculty.faculty_name
from instructor
join faculty on faculty.faculty_id=instructor.faculty_id;

-- 2.	Đưa ra thông tin gồm mã số, họ tên và tên khoa của các giảng viên của khoa ‘DIA LY va QLTN’
select instructor.instructor_id,instructor.instructor_name,faculty.faculty_name
from instructor
join faculty on faculty.faculty_id=instructor.faculty_id
where faculty.faculty_name='dia ly' or faculty.faculty_name='QLTN' ;

-- 3.	Cho biết số sinh viên của khoa ‘CONG NGHE SINH HOC’
select faculty.faculty_name,count(*)
from faculty
join student on student.faculty_id=faculty.faculty_id
group by student.faculty_id
having faculty.faculty_name='cong nghe sinh hoc';

-- 4.	Đưa ra danh sách gồm mã số, họ tên và tuổi của các sinh viên khoa ‘TOAN’
select student.student_id,student.student_name,student.date_of_birth,faculty.faculty_name
from student
join faculty on faculty.faculty_id=student.faculty_id
where faculty.faculty_name='toan';

-- 5.	Cho biết số giảng viên của khoa ‘CONG NGHE SINH HOC’
select faculty.faculty_name,count(*)
from instructor
join faculty on faculty.faculty_id=instructor.faculty_id
group by instructor.faculty_id
having faculty.faculty_name='cong nghe sinh hoc';

-- 6.	Cho biết thông tin về sinh viên không tham gia thực tập
select student.student_id,student.student_name,student.date_of_birth,student.place_of_birth
from student
left join instructor_student on student.student_id=instructor_student.student_id
where instructor_student.id is null;

-- 7.	Đưa ra mã khoa, tên khoa và số giảng viên của mỗi khoa
select faculty.faculty_name,count(*)
from instructor
join faculty on faculty.faculty_id=instructor.faculty_id
group by instructor.faculty_id;

-- 8.	Cho biết số điện thoại của khoa mà sinh viên có tên ‘Le van son’ đang theo học
select student.student_name,faculty.phone
from student
join faculty on faculty.faculty_id=student.faculty_id
where student.student_name='le van son';