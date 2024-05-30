package com.example.keycloak_backEnd.Controller;

import com.example.keycloak_backEnd.service.MainService;
import com.example.keycloak_backEnd.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    MainService mainService;

    @GetMapping(value = "/getTeacherDescData")
    public ResponseEntity getTeacherDescData(@RequestParam String email) throws Exception{
        return ResponseEntity.ok(mainService.getTeacherDescData(email));
    }
}
