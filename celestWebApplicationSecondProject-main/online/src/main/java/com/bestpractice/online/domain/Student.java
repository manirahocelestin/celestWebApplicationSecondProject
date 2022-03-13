package com.bestpractice.online.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name")
    private String names;
    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private EGender gender;
    @Column(name = "dateOfBirthDay")
    private LocalDate dob;
    @Column(name = "address")
    private String address;
    @ManyToMany(mappedBy = "students")
    private Set<Course> courses = new HashSet<>();
    @ManyToOne
    //@JoinColumn(name = "stud_dep")
    private Department department;
    @ManyToOne
   // @JoinColumn(name = "stud_fact")
    private Faculty faculty;

    public Student() {
    }

    public Student(String names, EGender gender, LocalDate dob, String address) {
        this.names = names;
        this.gender = gender;
        this.dob = dob;
        this.address = address;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public EGender getGender() {
        return gender;
    }

    public void setGender(EGender gender) {
        this.gender = gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", names='" + names + '\'' +
                ", gender=" + gender +
                ", dob=" + dob +
                ", address='" + address + '\'' +
                ", courses=" + courses +
                ", department=" + department +
                ", faculty=" + faculty +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
