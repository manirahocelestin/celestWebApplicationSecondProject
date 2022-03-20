package com.amazingapplication.wake.Service;

import com.amazingapplication.wake.domain.Course;
import com.amazingapplication.wake.domain.Student;

import java.util.List;
import java.util.zip.CheckedOutputStream;

public interface ICourseService {
    Course  createCourse(Course course);

    List<Course> findAllCourse();

    void removeCourse(Long courId);

    Course updateCourse(Course course);

    Course getCourseById(Long courseId);

}
