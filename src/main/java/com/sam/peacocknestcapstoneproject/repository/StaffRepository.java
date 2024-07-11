package com.sam.peacocknestcapstoneproject.repository;

import com.sam.peacocknestcapstoneproject.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Long> {
    // Example of custom query method
    List<Staff> findByPosition(String position);
    // Add other custom query methods as needed
}
