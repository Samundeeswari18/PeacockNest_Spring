package com.sam.peacocknestcapstoneproject.repository;

import com.sam.peacocknestcapstoneproject.entity.Child;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChildRepository extends JpaRepository<Child, Long> {
    // Example of custom query method


    List<Child> findByParentUsername(String parentUsername);
    // Add other custom query methods as needed
}

