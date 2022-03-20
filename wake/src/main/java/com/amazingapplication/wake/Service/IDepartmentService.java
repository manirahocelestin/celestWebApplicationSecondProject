package com.amazingapplication.wake.Service;

import com.amazingapplication.wake.domain.Department;
import com.amazingapplication.wake.domain.Student;

import java.util.List;

public interface IDepartmentService {
    Department createDepartment(Department department);

    List<Department> findAllDepartment();

    void removeDepartment(Long depId);

    Department updateDepartment(Department department);

    Department getDepartmentById(Long departmentId);
}
