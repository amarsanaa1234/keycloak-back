package com.example.keycloak_backEnd.Controller;

import com.example.keycloak_backEnd.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/helloFirst")
    public String hello() {
        return "Hello from Spring boot & Keycloak";
    }

    @GetMapping("/hello-2")
    public String hello2() {
        return "Hello from Spring boot & Keycloak - ADMIN";
    }

    @GetMapping(value = "/getStudentData")
    public ResponseEntity getStudentData() throws Exception{
        return ResponseEntity.ok(studentService.getStudentData(1L));
    }
}