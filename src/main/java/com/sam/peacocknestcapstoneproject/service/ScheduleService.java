package com.sam.peacocknestcapstoneproject.service;

import com.sam.peacocknestcapstoneproject.entity.Salary;
import com.sam.peacocknestcapstoneproject.entity.Schedule;

import java.util.List;

public interface ScheduleService {
    Schedule save(Schedule schedule);
    List<Schedule> findByStaffId(Long staffId);
    // Add other methods as needed
}

