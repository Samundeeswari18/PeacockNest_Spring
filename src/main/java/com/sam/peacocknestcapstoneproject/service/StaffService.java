package com.sam.peacocknestcapstoneproject.service;

import com.sam.peacocknestcapstoneproject.entity.Staff;

import java.util.List;

public interface StaffService {
    Staff save(Staff staff);
    List<Staff> findByPosition(String position);
    // Add other methods as needed
}

