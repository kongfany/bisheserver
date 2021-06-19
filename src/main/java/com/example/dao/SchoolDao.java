package com.example.dao;

import com.example.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolDao extends JpaRepository<School, Long>, JpaSpecificationExecutor<School> {

}