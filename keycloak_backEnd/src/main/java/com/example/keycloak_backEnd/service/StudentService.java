package com.example.keycloak_backEnd.service;

import com.example.keycloak_backEnd.entity.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService extends Main {

    public Student getStudentData(String email) throws Exception{
        Student student = studentDAO.getByEmail(email);
        return student;
    }

    public Student getStudentAndTeacher(String email) throws Exception{
        Student student = studentDAO.getByEmail(email);
        student.setTeacherList(teacherDAO.getByCode(student.getTeacherCode()));
        return student;
    }
}