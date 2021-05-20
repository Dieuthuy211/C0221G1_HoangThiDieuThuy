use quan_ly_thuc_tap;
-- 1.	Cho biết mã số và tên của các đề tài do giảng viên ‘Tran son’ hướng dẫn
select faculty.faculty_id,faculty.faculty_name,instructor.instructor_name
from instructor
join faculty on faculty.faculty_id=instructor.faculty_id
where instructor.instructor_name='tran son';

-- 2.	Cho biết tên đề tài không có sinh viên nào thực tập
select *
from project
left join instructor_student on project.project_id=instructor_student.project_id
where instructor_student.id is null;

-- 3.	Cho biết mã số, họ tên, tên khoa của các giảng viên hướng dẫn từ 3 sinh viên trở lên.
select faculty.faculty_id,faculty.faculty_name,instructor.instructor_name
from instructor
join faculty on faculty.faculty_id=instructor.faculty_id
join instructor_student on instructor_student.instructor_id=instructor.instructor_id
group by instructor.instructor_id
having count(instructor_student.student_id)>=3;

-- 4.	Cho biết mã số, tên đề tài của đề tài có kinh phí cao nhất
select project.project_id,project.project_name,max(expense)
from project;

-- 5.	Cho biết mã số và tên các đề tài có nhiều hơn 2 sinh viên tham gia thực tập
select faculty.faculty_id,faculty.faculty_name,student.student_name
from student
join faculty on faculty.faculty_id=student.faculty_id
join instructor_student on instructor_student.student_id=student.student_id
group by student.student_id
having count(instructor_student.project_id)>=2;

-- 6.	Đưa ra mã số, họ tên và điểm của các sinh viên khoa ‘DIALY và QLTN’
select student.student_id,student.student_name,faculty.faculty_name,
       instructor_student.grade
from student
join faculty on faculty.faculty_id=student.faculty_id
join instructor_student on instructor_student.student_id=student.student_id
where faculty.faculty_name='dia ly' or faculty.faculty_name='QLTN' ;

-- 7.	Đưa ra tên khoa, số lượng sinh viên của mỗi khoa
select faculty.faculty_name,count(student.student_id)
from student
join faculty on faculty.faculty_id=student.faculty_id
group by faculty.faculty_id;

-- 8.	Cho biết thông tin về các sinh viên thực tập tại quê nhà
select student.student_id,student.student_name,student.place_of_birth
from student
join instructor_student on instructor_student.student_id=student.student_id
join project on project.project_id=instructor_student.project_id
where student.place_of_birth=project.place_of_intern;

-- 9.	Hãy cho biết thông tin về những sinh viên chưa có điểm thực tập
select *
from student
 left join instructor_student on instructor_student.student_id=student.student_id
 where instructor_student.grade is null;
 
-- 10.	 Đưa ra danh sách gồm mã số, họ tên các sinh viên có điểm thực tập bằng 0
select student.student_id,student.student_name,faculty.faculty_name,
       instructor_student.grade
from student
join faculty on faculty.faculty_id=student.faculty_id
join instructor_student on instructor_student.student_id=student.student_id
where instructor_student.grade=0;
 
