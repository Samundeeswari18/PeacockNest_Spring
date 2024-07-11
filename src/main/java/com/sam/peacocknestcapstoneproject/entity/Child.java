package com.sam.peacocknestcapstoneproject.entity;

import jakarta.persistence.Id;
import lombok.*;

import jakarta.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Child {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Parent parent; // Assuming Parent is another entity class in your application

    // getters and setters, constructors
}
