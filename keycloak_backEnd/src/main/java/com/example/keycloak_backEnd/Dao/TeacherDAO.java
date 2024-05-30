package com.example.keycloak_backEnd.Dao;

import com.example.keycloak_backEnd.base.MofRepository;
import com.example.keycloak_backEnd.entity.Teacher;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherDAO extends MofRepository<Teacher, Long> {

    @Query("select a from Teacher a where a.code = ?1 ")
    Teacher getByCode(String code);

    @Query("select a from Teacher a where a.email = ?1 ")
    Teacher getByEmail(String email);
}
