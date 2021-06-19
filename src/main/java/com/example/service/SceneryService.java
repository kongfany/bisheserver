package com.example.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import java.util.List;
import com.example.dao.SceneryDao;
import com.example.entity.Scenery;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class SceneryService {

    @Resource
    private SceneryDao sceneryDao;

    public Scenery save(Scenery scenery) {
        return sceneryDao.save(scenery);
    }

    public void delete(Long id) {
        sceneryDao.deleteById(id);
    }

    public Scenery findById(Long id) {
        return sceneryDao.findById(id).orElse(null);    }

    public List<Scenery> findAll() {
        return sceneryDao.findAll();
    }

    public Page<Scenery> findPage(int pageNum, int pageSize) {
        return sceneryDao.findAll(PageRequest.of(pageNum - 1, pageSize));
    }

}