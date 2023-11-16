package com.example.starterProject.Service;

import java.util.List;
import com.example.starterProject.Entity.Staff;
public interface StaffService {
    void save(Staff staff);
    List<Staff> getAll();
    Staff getById(Integer id);
    void delete(Staff staff);
}

