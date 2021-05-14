use quan_ly_sinh_vien;
-- Hiển thị tất cả các sinh viên có tên bắt đầu bảng ký tự ‘h’
select * from student
where student_name like "H%";

-- Hiển thị các thông tin lớp học có thời gian bắt đầu vào tháng 12.
select* from class 
where start_data like "%12%";

-- Hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5.
select* from `subject`
where credit between 3 and 5;

-- Thay đổi mã lớp(ClassID) của sinh viên có tên ‘Hung’ là 2.
update student 
set id_class=2
where  student_name='Hung';
SET SQL_SAFE_UPDATES = 0;

-- Hiển thị các thông tin: StudentName, SubName, Mark. Dữ liệu sắp xếp theo điểm thi (mark) giảm dần. nếu trùng sắp theo tên tăng dần.
select student.student_name,`subject`.subject_name,mark.mark
from mark
join student on student.id_student=mark.id_student
join `subject` on `subject`.id_subject=mark.id_subject
order by mark.mark ,student.student_name;

