package com.amazingapplication.wake.Service;

import com.amazingapplication.wake.domain.Student;
import com.amazingapplication.wake.repo.IStudentRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService implements IStudentService{
    private IStudentRep studentRep;
@Autowired
    public StudentService(IStudentRep studentRep) {
        this.studentRep = studentRep;
    }

    @Override
    public Student CreateStudent(Student student) {
        return studentRep.save(student);
    }

    @Override
    public List<Student> findAll() {
        return studentRep.findAll();
    }

    @Override
    public void removeStudent(Long studId) {
    studentRep.deleteById(studId);

    }

    @Override
    public Student updateStudent(Student student) {
        return studentRep.save(student);
    }

    @Override
    public Student getStudentById(Long studentId) {
        return studentRep.findById(studentId).get();
    }
}
