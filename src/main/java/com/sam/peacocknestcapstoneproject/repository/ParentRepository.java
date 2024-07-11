package com.sam.peacocknestcapstoneproject.repository;


import com.sam.peacocknestcapstoneproject.entity.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentRepository extends JpaRepository<Parent, Long> {
    // Example of custom query method
    Parent findByEmail(String email);
    // Add other custom query methods as needed
}

