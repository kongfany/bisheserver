package com.example.controller;

import com.example.common.Result;
import com.example.entity.School;
import com.example.service.SchoolService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/school")
public class SchoolController {
    @Resource
     private SchoolService schoolService;

    @PostMapping
    public Result<School> save(@RequestBody School school) {
        return Result.success(schoolService.save(school));
    }

    @PutMapping
    public Result<?> update(@RequestBody School school) {
        return Result.success(schoolService.save(school));
    }

    @DeleteMapping("/{id}")
    public Result<?> delete(@PathVariable Long id) {
        schoolService.delete(id);
        return Result.success();
    }

    @GetMapping("/{id}")
    public Result<School> findById(@PathVariable Long id) {
        return Result.success(schoolService.findById(id));
    }

    @GetMapping
    public Result<List<School>> findAll() {
        return Result.success(schoolService.findAll());
    }

    @GetMapping("/page")
    public Result<Page<School>> findPage(@RequestParam(required = false, defaultValue = "1") Integer pageNum, @RequestParam(required = false, defaultValue = "10") Integer pageSize) {
        return Result.success(schoolService.findPage(pageNum, pageSize));
    }

}