package com.example.Learn.service.Impl;


import com.example.Learn.model.Student;
import com.example.Learn.repository.StudentRepository;
import com.example.Learn.service.StudentService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class DBStudentService implements StudentService {


    private final StudentRepository repository;

    public DBStudentService(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Student save(Student student) {
        return this.repository.save(student);
    }

    @Override
    public List<Student> findAllStudents() {
        return this.repository.findAll();
    }

    @Override
    public Student findByEmail(String email) {
        return this.repository.findByEmail(email);
    }

    @Override
    public Student updateStudentDetails(Student student) {
        return this.repository.save(student);
    }

    @Override
    public void deleteStudent(String email) {
        this.repository.deleteByEmail(email);
    }
}
