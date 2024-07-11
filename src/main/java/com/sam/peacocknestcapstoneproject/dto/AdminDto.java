package com.sam.peacocknestcapstoneproject.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class AdminDto{
    private Long id;
    private String username;
    private String password;
    private String fullName;
    // Add other fields as needed

    // Constructors, getters, setters
}
