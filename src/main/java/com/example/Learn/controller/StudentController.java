package com.example.Learn.controller;

import com.example.Learn.model.Student;
import com.example.Learn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public Student save(@RequestBody Student student){
        return studentService.save(student);
    }

    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable String email){
        return this.studentService.findByEmail(email);
    }

    @GetMapping
    public List<Student> findAllStudents(){
        return this.studentService.findAllStudents();
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student student){
        return this.studentService.updateStudentDetails(student);
    }

    @DeleteMapping("/{email}")
    public String deleteStudent(@PathVariable String email){
        this.studentService.deleteStudent(email);
        return "student deleted with email: " + email;
    }
}
