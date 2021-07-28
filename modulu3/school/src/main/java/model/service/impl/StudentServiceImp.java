package model.service.impl;

import model.bean.Student;
import model.repository.StudentRepository;
import model.service.IStudentService;

import java.util.List;

public class StudentServiceImp implements IStudentService {
StudentRepository repository=new StudentRepository();
    @Override
    public List<Student> findAll() {
        return repository.listStudent();
    }

    @Override
    public void insert(Student student) {
        repository.insert(student);

    }

    @Override
    public Student findById(int id) {
        return repository.listById(id);
    }

    @Override
    public boolean update(Student student) {
        return repository.update(student);
    }

    @Override
    public boolean delete(int id) {
        return repository.delete(id);
    }

    @Override
    public List<Student> search(String search) {
        return repository.search(search);
    }
}
