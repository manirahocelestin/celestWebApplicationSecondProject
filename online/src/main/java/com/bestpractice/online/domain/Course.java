package com.bestpractice.online.domain;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long code;
    @Column(name = "name")
    private String name;
    @Column(name = "credit")
    private int credit;
    @Column(name = "fees")
    private double fees;
    @ManyToOne
    private Department department;
    @ManyToMany
    @JoinTable(name = "student_course",joinColumns = @JoinColumn(name = "course_id"),inverseJoinColumns =
    @JoinColumn(name = "student_id"))

    private Set<Student> students;

    public Course() {
    }

    public Course(String name, int credit, double fees, Department department, Set<Student> students) {
        this.name = name;
        this.credit = credit;
        this.fees = fees;
        this.department = department;
        this.students = students;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Course{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", credit=" + credit +
                ", fees=" + fees +
                ", department=" + department +
                ", students=" + students +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(code, course.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

}
