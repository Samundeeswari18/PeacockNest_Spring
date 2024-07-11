package com.sam.peacocknestcapstoneproject.service;

import com.sam.peacocknestcapstoneproject.entity.Child;

import java.util.List;

public interface ChildService {
    Child save(Child child);
    List<Child> findByParentUsername(String parentName);
    // Add other methods as needed
}
