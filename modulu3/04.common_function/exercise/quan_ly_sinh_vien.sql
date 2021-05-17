use quan_ly_sinh_vien;

-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
select id_subject, subject_name,`status`,credit
from `subject`
where credit=(select max(credit) from `subject`);



-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
 select m.id_subject,m.id_student,max(mark),exam_Times,
        sb.subject_name
 from mark m
 join `subject` sb on sb.id_subject=m.id_subject
 where mark=(select max(mark) from mark) 
 group by sb.id_subject;
 
--  Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
 select s.id_student,s.student_name,
        avg(mark) as diem_trung_binh
from student s
left join mark m on m.id_student=s.id_student
group by s.id_student
order by diem_trung_binh desc;