package com.example.dao;

import com.example.entity.Scenery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface SceneryDao extends JpaRepository<Scenery, Long>, JpaSpecificationExecutor<Scenery> {

}