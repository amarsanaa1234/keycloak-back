package com.example.keycloak_backEnd.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @GetMapping("/getTeacher")
    public String hello() {
        return "Hello from Spring boot & Keycloak";
    }
}
