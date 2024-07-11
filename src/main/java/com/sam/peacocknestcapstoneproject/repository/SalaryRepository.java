package com.sam.peacocknestcapstoneproject.repository;

import com.sam.peacocknestcapstoneproject.entity.Salary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SalaryRepository extends JpaRepository<Salary, Long> {
    // Example of custom query method
    List<Salary> findByAmountGreaterThan(double amount);
    // Add other custom query methods as needed
}
