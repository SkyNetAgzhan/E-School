package com.example.schoolmanager.service;

import com.example.schoolmanager.model.Student;
import com.example.schoolmanager.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepo studentRepo;

    @Autowired
    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public Student addStudent (Student student){
        return studentRepo.save(student);
    }

    public List<Student> findAllStudents(){
        return studentRepo.findAll();
    }

    public void deleteStudent(Long id){
        studentRepo.deleteById(id);
    }
}
