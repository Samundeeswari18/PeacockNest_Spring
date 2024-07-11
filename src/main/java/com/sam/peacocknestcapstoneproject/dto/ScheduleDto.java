package com.sam.peacocknestcapstoneproject.dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class ScheduleDto {
    private Long id;
    private Long staffId; // Assuming staff ID for association
    private String day;
    private String startTime;
    private String endTime;
    // Add other fields as needed

    // Constructors, getters, setters
}
