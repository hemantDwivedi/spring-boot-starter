package com.example.Learn.service.Impl;

import com.example.Learn.Dao.InMemoryStudentDao;
import com.example.Learn.model.Student;
import com.example.Learn.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InMemoryStudnetService implements StudentService {

    private final InMemoryStudentDao inMemoryStudentDao;

    public InMemoryStudnetService(InMemoryStudentDao inMemoryStudentDao) {
        this.inMemoryStudentDao = inMemoryStudentDao;
    }

    @Override
    public Student save(Student student) {
        return this.inMemoryStudentDao.save(student);
    }

    @Override
    public List<Student> findAllStudents(){
        return this.inMemoryStudentDao.findAllStudent();
    }

    @Override
    public Student findByEmail(String email) {
        return this.inMemoryStudentDao.findByEmail(email);
    }

    @Override
    public Student updateStudentDetails(Student student) {
        return this.inMemoryStudentDao.updateStudentDetails(student);
    }

    @Override
    public void deleteStudent(String email) {
        this.inMemoryStudentDao.deleteStudent(email);
    }
}