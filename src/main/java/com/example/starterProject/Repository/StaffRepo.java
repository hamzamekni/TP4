package com.example.starterProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.starterProject.Entity.Staff;
public interface StaffRepo extends JpaRepository<Staff,
        Integer> {
}
