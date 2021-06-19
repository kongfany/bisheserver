package com.example.dao;

import com.example.entity.Collect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CollectDao extends JpaRepository<Collect, Long>, JpaSpecificationExecutor<Collect> {

}