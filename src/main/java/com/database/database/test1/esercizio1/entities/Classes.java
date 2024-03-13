package com.database.database.test1.esercizio1.entities;

import jakarta.persistence.*;

@Table
@Entity

public class Classes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String description;
}
