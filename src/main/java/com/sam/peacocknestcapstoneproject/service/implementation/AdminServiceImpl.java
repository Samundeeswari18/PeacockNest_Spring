package com.sam.peacocknestcapstoneproject.service.implementation;

import com.sam.peacocknestcapstoneproject.entity.Admin;
import com.sam.peacocknestcapstoneproject.repository.AdminRepository;
import com.sam.peacocknestcapstoneproject.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public Admin save(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public Admin findByUsername(String username) {
        return adminRepository.findByUsername(username);
    }

    @Override
    public boolean existsByUsername(String username) {
        return adminRepository.existsByUsername(username);
    }

    // Add other methods as needed
}
