package com.example.keycloak_backEnd.Controller;


import com.example.keycloak_backEnd.service.MainService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class MainController {

    private final MainService mainService;

    public MainController(MainService mainService) {
        this.mainService = mainService;
    }

    @GetMapping("/getAlert")
    public ResponseEntity getAlert() throws Exception {
        return ResponseEntity.ok(mainService.getAllByAlert());
    }

}
