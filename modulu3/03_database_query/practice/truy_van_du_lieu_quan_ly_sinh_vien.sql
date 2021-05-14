use quan_ly_sinh_vien;

-- Hiển thị danh sách tất cả các học viên-- 
select * from student;

-- Hiển thị danh sách các học viên đang theo học.
select * from student
 where `status`= true;

-- Hiển thị danh sách các môn học có thời gian học nhỏ hơn 10 giờ.
select * from `subject`
 where `subject`.credit<10;

-- Hiển thị danh sách học viên lớp A1
select *
 from student 
 join class on student.id_class=class.id_class
 where class.class_name="A1";
 
--  Hiển thị điểm môn CF của các học viên.
select student.student_name,`subject`.subject_name,mark.mark from mark 
join student on mark.id_student=student.id_student 
join `subject` on mark.id_subject=`subject`.id_subject
where `subject`.subject_name='CF';