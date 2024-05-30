package com.example.keycloak_backEnd.service;

import com.example.keycloak_backEnd.Dao.AlertDAO;
import com.example.keycloak_backEnd.Dao.StudentDAO;
import com.example.keycloak_backEnd.Dao.TeacherDAO;
import lombok.extern.java.Log;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

@Log
public class Main {
    @Autowired
    protected StudentDAO studentDAO;

    @Autowired
    protected AlertDAO alertDAO;

    @Autowired
    protected TeacherDAO teacherDAO;
}