package com.example.keycloak_backEnd.service;

import com.example.keycloak_backEnd.entity.Alert;
import com.example.keycloak_backEnd.entity.Student;
import com.example.keycloak_backEnd.entity.Teacher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService extends Main{

    public List<Alert> getAllByAlert() throws Exception{
        List<Alert> alertList = alertDAO.getAllByAlert();
        return alertList;
    }

    public Teacher getTeacherDescData(String email) throws Exception{
        Teacher teacher = teacherDAO.getByEmail(email);
        return teacher;
    }
}
