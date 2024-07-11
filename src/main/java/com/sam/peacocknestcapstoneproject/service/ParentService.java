package com.sam.peacocknestcapstoneproject.service;


import com.sam.peacocknestcapstoneproject.dto.ParentDto;
import com.sam.peacocknestcapstoneproject.entity.Parent;

public interface ParentService {
    Parent save(Parent parent);
    Parent findById(Long id);

}
