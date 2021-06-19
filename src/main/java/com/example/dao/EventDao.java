package com.example.dao;

import com.example.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface EventDao extends JpaRepository<Event, Long>, JpaSpecificationExecutor<Event> {
    Event findByName(String name);
}