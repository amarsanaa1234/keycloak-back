package com.example.keycloak_backEnd.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "alert", schema = "keycloak_database")
@Data
public class Alert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, updatable = false)
    private Long id;

    @Basic
    @Column(name = "TEXT")
    private String text;

    @Basic
    @Column(name = "ACTIVE_FLAG")
    private Integer activeFlag;

    @Basic
    @Column(name = "HREF")
    private String href;
}
