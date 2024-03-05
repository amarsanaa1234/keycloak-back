package com.example.keycloak_backEnd.service;

import com.example.keycloak_backEnd.Dao.StudentDAO;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;

@Log
public class Main {
    @Autowired
    protected StudentDAO studentDAO;
}
