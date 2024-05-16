package com.example.keycloak_backEnd.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "student", schema = "keycloak_database")
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, updatable = false)
    private Long id;

    @Basic
    @Column(name = "FIRSTNAME")
    private String firstname;

    @Basic
    @Column(name = "LASTNAME")
    private String lastname;

    @Basic
    @Column(name = "ID")
    private String school;

    @Basic
    @Column(name = "STUDENT_ID")
    private String studentId;

    @Basic
    @Column(name = "PIN")
    private String pin;

    @Basic
    @Column(name = "DEPARTMENT")
    private String department;

    @Basic
    @Column(name = "PHONE")
    private String phone;

    @Basic
    @Column(name = "FROM_OF_LEARNING")
    private String fromOfLearning;

    @Basic
    @Column(name = "GENDER")
    private String gender;

    @Basic
    @Column(name = "EMAIL")
    private String email;

}