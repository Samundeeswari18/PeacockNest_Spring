package com.sam.peacocknestcapstoneproject.service;

import com.sam.peacocknestcapstoneproject.entity.Salary;

import java.util.List;

public interface SalaryService {
    Salary save(Salary salary);
    List<Salary> findByAmountGreaterThan(double amount);
    // Add other methods as needed
}
