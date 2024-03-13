package com.database.database.test1.esercizio1.entities;

import jakarta.persistence.*;


@Table
@Entity
public class Enrollments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "student_id",nullable = false)
    private Student student;
    @ManyToOne
    @JoinColumn(name = "classes_id",nullable = false)
    private Classes classes;

}
