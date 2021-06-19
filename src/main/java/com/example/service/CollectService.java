package com.example.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import java.util.List;
import com.example.dao.CollectDao;
import com.example.entity.Collect;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class CollectService {

    @Resource
    private CollectDao collectDao;

    public Collect save(Collect collect) {
        return collectDao.save(collect);
    }

    public void delete(Long id) {
        collectDao.deleteById(id);
    }

    public Collect findById(Long id) {
        return collectDao.findById(id).orElse(null);    }

    public List<Collect> findAll() {
        return collectDao.findAll();
    }

    public Page<Collect> findPage(int pageNum, int pageSize) {
        return collectDao.findAll(PageRequest.of(pageNum - 1, pageSize));
    }

}