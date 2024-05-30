package com.example.keycloak_backEnd.Controller;

import com.example.keycloak_backEnd.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping(value = "/getStudentData")
    public ResponseEntity getStudentData(@RequestParam String email) throws Exception{
        return ResponseEntity.ok(studentService.getStudentData(email));
    }

    @GetMapping(value = "/getStudentAndTeacher")
    public ResponseEntity getStudentAndTeacher(@RequestParam String email) throws Exception{
        return ResponseEntity.ok(studentService.getStudentAndTeacher(email));
    }
}