package com.sam.peacocknestcapstoneproject.repository;

import com.sam.peacocknestcapstoneproject.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
    // Example of custom query method
    List<Schedule> findByStaffId(Long staffId);
    // Add other custom query methods as needed
}
