package com.bestpractice.online.rep;

import com.bestpractice.online.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRep extends JpaRepository<Course,Long> {
}
