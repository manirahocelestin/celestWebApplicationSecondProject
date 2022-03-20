package com.amazingapplication.wake.Service;

import com.amazingapplication.wake.domain.Course;
import com.amazingapplication.wake.repo.ICourseRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseService implements ICourseService{
    private ICourseRep courseRep;
    @Autowired

    public CourseService(ICourseRep courseRep) {
        this.courseRep = courseRep;
    }




    @Override
    public Course createCourse(Course course) {
        return courseRep.save(course);
    }

    @Override
    public List<Course> findAllCourse() {
        return courseRep.findAll();
    }

    @Override
    public void removeCourse(Long courId) {
        courseRep.deleteById(courId);

    }

    @Override
    public Course updateCourse(Course course) {
        return courseRep.save(course);
    }

    @Override
    public Course getCourseById(Long courseId) {
        return courseRep.findById(courseId).get();
    }


}
