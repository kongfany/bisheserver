package com.example.service;

import com.example.dao.UserDao;
import com.example.entity.User;
import com.example.exception.CustomException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    private UserDao userDao;

    //增
    public User save(User user) {
        return userDao.save(user);
    }

    //删
    public void delete(Long id) {
        userDao.deleteById(id);
    }


    public User findById(Long id) {
        return userDao.findById(id).orElse(null);
    }


    public List<User> findAll() {
        return userDao.findAll();
    }

    //分页查询，传进的页码需要减一，默认页码从零开始的
    public Page<User> findPage(int pageNum, int pageSize) {
        return userDao.findAll(PageRequest.of(pageNum - 1, pageSize));
    }

    public User login(User user) {
        User res = userDao.findByUsernameAndPassword(user.getUsername(), user.getPassword());
        if (res == null) {
            throw new CustomException("-1", "账号或密码错误");
        }
        return res;
    }

    public User add(User user) {
        return userDao.save(user);
    }

    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }

}
