package com.example.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import java.util.List;
import com.example.dao.ProductDao;
import com.example.entity.Product;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class ProductService {

    @Resource
    private ProductDao productDao;

    public Product save(Product product) {
        return productDao.save(product);
    }

    public void delete(Long id) {
        productDao.deleteById(id);
    }

    public Product findById(Long id) {
        return productDao.findById(id).orElse(null);    }

    public List<Product> findAll() {
        return productDao.findAll();
    }

    public Page<Product> findPage(int pageNum, int pageSize) {
        return productDao.findAll(PageRequest.of(pageNum - 1, pageSize));
    }

}