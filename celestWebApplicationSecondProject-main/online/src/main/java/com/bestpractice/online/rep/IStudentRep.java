package com.bestpractice.online.rep;

import com.bestpractice.online.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRep  extends JpaRepository<Student,Long> {
}
