package com.example.controller;

import com.example.common.Result;
import com.example.entity.Collect;
import com.example.service.CollectService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/collect")
public class CollectController {
    @Resource
     private CollectService collectService;

    @PostMapping
    public Result<Collect> save(@RequestBody Collect collect) {
        return Result.success(collectService.save(collect));
    }

    @PutMapping
    public Result<?> update(@RequestBody Collect collect) {
        return Result.success(collectService.save(collect));
    }

    @DeleteMapping("/{id}")
    public Result<?> delete(@PathVariable Long id) {
        collectService.delete(id);
        return Result.success();
    }

    @GetMapping("/{id}")
    public Result<Collect> findById(@PathVariable Long id) {
        return Result.success(collectService.findById(id));
    }

    @GetMapping
    public Result<List<Collect>> findAll() {
        return Result.success(collectService.findAll());
    }

    @GetMapping("/page")
    public Result<Page<Collect>> findPage(@RequestParam(required = false, defaultValue = "1") Integer pageNum, @RequestParam(required = false, defaultValue = "10") Integer pageSize) {
        return Result.success(collectService.findPage(pageNum, pageSize));
    }

}