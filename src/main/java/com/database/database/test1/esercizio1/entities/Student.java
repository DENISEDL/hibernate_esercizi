package com.database.database.test1.esercizio1.entities;

import jakarta.persistence.*;

import java.util.List;

@Table
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(unique = true,length = 100,nullable = false)
    private String email;



}
