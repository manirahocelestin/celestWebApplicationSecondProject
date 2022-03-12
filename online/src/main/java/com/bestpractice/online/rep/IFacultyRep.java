package com.bestpractice.online.rep;

import com.bestpractice.online.domain.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFacultyRep extends JpaRepository<Faculty,Long> {
}
