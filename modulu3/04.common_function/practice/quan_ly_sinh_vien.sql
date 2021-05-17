use quan_ly_sinh_vien;

-- Hiển thị số lượng sinh viên ở từng nơi
select address,count(address) as so_luong_sinh_vien
from student
group by address;

-- Tính điểm trung bình các môn học của mỗi học viên
select s.id_student,s.student_name,avg(mark) as diem_trung_binh
from student s
join mark m on m.id_student=s.id_student
group by s.id_student;

-- Hiển thị những bạn học viên co điểm trung bình các môn học lớn hơn 15
select s.id_student,s.student_name,avg(mark) as diem_trung_binh
from student s
join mark m on m.id_student=s.id_student
group by s.id_student
having diem_trung_binh>15;


-- Hiển thị thông tin các học viên có điểm trung bình lớn nhất.
select s.id_student,s.student_name,avg(mark) as diem_trung_binh
from student s
join mark m on m.id_student=s.id_student
group by s.id_student
having diem_trung_binh>= all(select avg(mark) from mark m group by m.id_student);

