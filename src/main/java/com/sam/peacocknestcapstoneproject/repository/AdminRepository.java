package com.sam.peacocknestcapstoneproject.repository;

import com.sam.peacocknestcapstoneproject.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

    Admin findByUsername(String username);

    boolean existsByUsername(String username);
    // Add other custom query methods as needed
}
