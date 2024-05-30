package com.example.keycloak_backEnd.service;

import com.example.keycloak_backEnd.entity.Alert;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService extends Main{

    public List<Alert> getAllByAlert() throws Exception{
        List<Alert> alertList = alertDAO.getAllByAlert();
        return alertList;
    }
}
