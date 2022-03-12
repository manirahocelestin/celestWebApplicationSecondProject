package com.bestpractice.online.implement;

import com.bestpractice.online.domain.Faculty;
import com.bestpractice.online.rep.ICourseRep;
import com.bestpractice.online.rep.IDepartmentRep;
import com.bestpractice.online.rep.IFacultyRep;
import com.bestpractice.online.rep.IStudentRep;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StudentImplementation implements CommandLineRunner {
    private final IStudentRep studentRep;
    private final ICourseRep courseRep;
    private final IFacultyRep facultyRep;
    private final IDepartmentRep departmentRep;

    public StudentImplementation(IStudentRep studentRep, ICourseRep courseRep, IFacultyRep facultyRep, IDepartmentRep departmentRep) {
        this.studentRep = studentRep;
        this.courseRep = courseRep;
        this.facultyRep = facultyRep;
        this.departmentRep = departmentRep;
    }

    @Override
    public void run(String... args) throws Exception {
        Faculty faculty= new Faculty("IT");
        facultyRep.save(faculty);
        System.out.println("The number of faculty is : " +facultyRep.count());
    }
}
