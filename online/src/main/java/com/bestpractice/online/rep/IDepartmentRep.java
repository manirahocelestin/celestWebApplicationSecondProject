package com.bestpractice.online.rep;

import com.bestpractice.online.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDepartmentRep extends JpaRepository<Department,Long> {
}
