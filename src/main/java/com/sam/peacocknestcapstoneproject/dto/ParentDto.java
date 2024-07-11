package com.sam.peacocknestcapstoneproject.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class ParentDto {
    private Long id;
    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    // Add other fields as needed

    // Constructors, getters, setters
}
