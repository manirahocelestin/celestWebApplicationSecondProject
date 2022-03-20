package com.amazingapplication.wake.Service;

import com.amazingapplication.wake.domain.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IStudentService {
    Student CreateStudent(Student student);
    List<Student> findAll();
    void removeStudent(Long studId);
    Student updateStudent(Student student);
    Student getStudentById(Long studentId);
}
