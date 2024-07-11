package com.sam.peacocknestcapstoneproject.service.implementation;

import com.sam.peacocknestcapstoneproject.dto.ParentDto;
import com.sam.peacocknestcapstoneproject.entity.Parent;
import com.sam.peacocknestcapstoneproject.repository.ParentRepository;
import com.sam.peacocknestcapstoneproject.service.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ParentServiceImpl implements ParentService {

    @Autowired
    private ParentRepository parentRepository;

    @Override
    public Parent save(Parent parent) {
        return parentRepository.save(parent);
    }


    @Override
    public Parent findById(Long id) {
        return (Parent) parentRepository.findById(id).orElse(null);
    }


}
