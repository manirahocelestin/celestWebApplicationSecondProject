package com.amazingapplication.wake.Service;

import com.amazingapplication.wake.domain.Department;
import com.amazingapplication.wake.repo.IDepartmentRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentService implements IDepartmentService{
    private IDepartmentRep departmentRep;
    @Autowired

    public DepartmentService(IDepartmentRep departmentRep) {
        this.departmentRep = departmentRep;
    }

    @Override
    public Department createDepartment(Department department) {
        return departmentRep.save(department);
    }

    @Override
    public List<Department> findAllDepartment() {
        return departmentRep.findAll();
    }

    @Override
    public void removeDepartment(Long depId) {
        departmentRep.deleteById(depId);

    }

    @Override
    public Department updateDepartment(Department department) {
        return departmentRep.save(department);
    }

    @Override
    public Department getDepartmentById(Long departmentId) {
        return departmentRep.findById(departmentId).get();
    }
}
