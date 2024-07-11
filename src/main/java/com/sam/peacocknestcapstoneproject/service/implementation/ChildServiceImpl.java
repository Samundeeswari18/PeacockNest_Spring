package com.sam.peacocknestcapstoneproject.service.implementation;

import com.sam.peacocknestcapstoneproject.entity.Child;
import com.sam.peacocknestcapstoneproject.repository.ChildRepository;
import com.sam.peacocknestcapstoneproject.service.ChildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ChildServiceImpl implements ChildService {

    @Autowired
    private ChildRepository childRepository;

    @Override
    public Child save(Child child) {
        return childRepository.save(child);
    }

    @Override
    public List<Child> findByParentUsername(String parentName) {
        return childRepository.findByParentUsername(parentName);
    }

    // Add other methods as needed
}
