package com.example.Learn.service;

import com.example.Learn.model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents(){
        return List.of(
                new Student(
                        "Hemant",
                        "Kumar",
                        LocalDate.now(),
                        "hemant@gmail.com",
                        23
                ),
                new Student(
                        "Ram",
                        "Kumar",
                        LocalDate.now(),
                        "kumarram@gmail.com",
                        25
                )
        );
    }
}
