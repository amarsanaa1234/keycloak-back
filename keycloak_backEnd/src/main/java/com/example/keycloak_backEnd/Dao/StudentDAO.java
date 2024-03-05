package com.example.keycloak_backEnd.Dao;

import com.example.keycloak_backEnd.base.MofRepository;
import com.example.keycloak_backEnd.entity.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDAO extends MofRepository<Student, Long> {

    @Query("select a from Student a where a.id = ?1")
    List<Student> getAllBy(Long number);
}
