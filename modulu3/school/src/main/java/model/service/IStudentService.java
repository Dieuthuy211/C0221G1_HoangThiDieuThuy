package model.service;

import model.bean.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();

    void insert(Student student);

    Student findById(int id);

    boolean update(Student student);

    boolean delete(int id);
    List<Student> search(String search);

}
