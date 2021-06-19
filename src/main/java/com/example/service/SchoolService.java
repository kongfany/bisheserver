package com.example.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import java.util.List;
import com.example.dao.SchoolDao;
import com.example.entity.School;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class SchoolService {

    @Resource
    private SchoolDao schoolDao;

    public School save(School school) {
        return schoolDao.save(school);
    }

    public void delete(Long id) {
        schoolDao.deleteById(id);
    }

    public School findById(Long id) {
        return schoolDao.findById(id).orElse(null);    }

    public List<School> findAll() {
        return schoolDao.findAll();
    }

    public Page<School> findPage(int pageNum, int pageSize) {
        return schoolDao.findAll(PageRequest.of(pageNum - 1, pageSize));
    }

}