package com.amazingapplication.wake.Service;

import com.amazingapplication.wake.domain.Faculty;

import java.util.List;

public interface IFacultyService {
    Faculty createFaculty(Faculty faculty);

    List<Faculty> findAllFaculty();

    void removeFaculty(Long factId);

    Faculty updateFaculty(Faculty faculty);

    Faculty getFacultyById(Long facultyId);
}
