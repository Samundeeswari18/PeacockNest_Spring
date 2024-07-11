package com.sam.peacocknestcapstoneproject.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String contactInfo;
    private String phoneNumber;
    private String position;
    private Date dateOfJoin;

    @ManyToOne
    @JoinColumn(name = "salary_id")
    private Salary salary;

    @ManyToOne
    @JoinColumn(name = "schedule_id")
    private Schedule schedule;

    // Getters and Setters
}
