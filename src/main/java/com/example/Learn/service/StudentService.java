package com.example.Learn.service;

import com.example.Learn.model.Student;

import java.util.List;

public interface StudentService {

    Student save(Student student);
    List<Student> findAllStudents();
    Student findByEmail(String email);
    Student updateStudentDetails(Student student);
    void deleteStudent(String email);
}
