package com.sam.peacocknestcapstoneproject.service;

import com.sam.peacocknestcapstoneproject.entity.Admin;

public interface AdminService {
    Admin save(Admin admin);
    Admin findByUsername(String username);
    boolean existsByUsername(String username);
    // Add other methods as needed
}
