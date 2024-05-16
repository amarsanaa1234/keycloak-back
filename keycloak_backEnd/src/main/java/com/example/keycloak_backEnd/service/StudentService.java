package com.example.keycloak_backEnd.service;

import com.example.keycloak_backEnd.Dao.StudentDAO;
import com.example.keycloak_backEnd.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService extends Main {

    public List<Student> getStudentData(Long number) throws Exception{
        List<Student> sda = studentDAO.getAllBy(number);
        System.out.println(sda);
        return sda;
    }
}