package com.example.service;

import com.example.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import java.util.List;
import com.example.dao.EventDao;
import com.example.entity.Event;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class EventService {

    @Resource
    private EventDao eventDao;

    public Event save(Event event) {
        return eventDao.save(event);
    }

    public void delete(Long id) {
        eventDao.deleteById(id);
    }

    public Event findById(Long id) {
        return eventDao.findById(id).orElse(null);    }

    public List<Event> findAll() {
        return eventDao.findAll();
    }

    public Page<Event> findPage(int pageNum, int pageSize) {
        return eventDao.findAll(PageRequest.of(pageNum - 1, pageSize));
    }
    public Event findByName(String name) {
        return eventDao.findByName(name);
    }
}