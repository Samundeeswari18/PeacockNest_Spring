package com.sam.peacocknestcapstoneproject.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class SalaryDto {
    private Long id;
    private Double amount;
    private Date date;
    // Add other fields as needed

    // Constructors, getters, setters
}
