package com.amazingapplication.wake.Service;


import com.amazingapplication.wake.domain.Faculty;
import com.amazingapplication.wake.repo.IFacultyRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FacultyService implements IFacultyService {
    private IFacultyRep facultyRep;
@Autowired
    public FacultyService(IFacultyRep facultyRep) {
        this.facultyRep = facultyRep;
    }

    @Override
    public Faculty createFaculty(Faculty faculty) {
        return facultyRep.save(faculty);
    }

    @Override
    public List<Faculty> findAllFaculty() {
        return facultyRep.findAll();
    }

    @Override
    public void removeFaculty(Long factId) {
    facultyRep.deleteById(factId);

    }

    @Override
    public Faculty updateFaculty(Faculty faculty) {
        return facultyRep.save(faculty);
    }

    @Override
    public Faculty getFacultyById(Long facultyId) {
        return facultyRep.findById(facultyId).get();
    }


}
