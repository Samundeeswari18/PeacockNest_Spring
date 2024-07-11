package com.sam.peacocknestcapstoneproject.controller;

import com.sam.peacocknestcapstoneproject.entity.Child;
import com.sam.peacocknestcapstoneproject.entity.Parent;
import com.sam.peacocknestcapstoneproject.service.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/parents")
public class ParentController {

    @Autowired
    private ParentService parentService;

    @GetMapping("/{parentId}/children")
    public List<Child> getChildrenByParentId(@PathVariable Long parentId) {
        Parent parent = parentService.findById(parentId);
        if (parent != null) {
            return parent.getChildren();
        }
        return null;
    }

    // Add other CRUD endpoints as needed
}
