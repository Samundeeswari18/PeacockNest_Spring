package com.sam.peacocknestcapstoneproject.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class ChildDto {
    private Long id;
    private String name;
    private Date birthDate;
    private String medicalInfo;
    private int age;
    private double height;
    private double weight;
    private Long parentId; // Assuming parent ID for association
    // Add other fields as needed

    // Constructors, getters, setters
}
