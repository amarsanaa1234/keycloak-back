package com.example.keycloak_backEnd.Dao;

import com.example.keycloak_backEnd.base.MofRepository;
import com.example.keycloak_backEnd.entity.Alert;
import com.example.keycloak_backEnd.entity.Student;
import com.example.keycloak_backEnd.entity.Teacher;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlertDAO extends MofRepository<Alert, Long> {

    @Query("select a from Alert a where a.activeFlag = 1 ")
    List<Alert> getAllByAlert();

}
