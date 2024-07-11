package com.sam.peacocknestcapstoneproject.dto;


import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class StaffDto {
    private Long id;
    private String name;
    private String contactInfo;
    private String phoneNumber;
    private String position;
    private Date dateOfJoin;
    // Add other fields as needed

    // Constructors, getters, setters
}
