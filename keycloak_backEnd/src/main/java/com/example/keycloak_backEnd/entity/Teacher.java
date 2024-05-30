package com.example.keycloak_backEnd.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "teacher", schema = "keycloak_database")
@Data
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, updatable = false)
    private Long id;

    @Basic
    @Column(name = "LAST_NAME")
    private String lastName;

    @Basic
    @Column(name = "FIRST_NAME")
    private String firstName;

    @Basic
    @Column(name = "FULL_NAME")
    private String fullName;

    @Basic
    @Column(name = "PIN")
    private String pin;

    @Basic
    @Column(name = "SCHOOL")
    private String school;

    @Basic
    @Column(name = "WORK")
    private String work;

    @Basic
    @Column(name = "CODE")
    private String code;

    @Basic
    @Column(name = "GENDER")
    private String gender;

    @Basic
    @Column(name = "ADDRESS")
    private String address;

    @Basic
    @Column(name = "EMAIL")
    private String email;

    @Basic
    @Column(name = "PHONE")
    private Integer phone;
}