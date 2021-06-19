package com.example.controller;

import com.example.common.Result;
import com.example.entity.Event;
import com.example.service.EventService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/event")
public class EventController {
    @Resource
     private EventService eventService;

    @PostMapping
    public Result<Event> save(@RequestBody Event event) {
        return Result.success(eventService.save(event));
    }

    @PutMapping
    public Result<?> update(@RequestBody Event event) {
        return Result.success(eventService.save(event));
    }

    @DeleteMapping("/{id}")
    public Result<?> delete(@PathVariable Long id) {
        eventService.delete(id);
        return Result.success();
    }

    @GetMapping("/{id}")
    public Result<Event> findById(@PathVariable Long id) {
        return Result.success(eventService.findById(id));
    }

    @GetMapping
    public Result<List<Event>> findAll() {
        return Result.success(eventService.findAll());
    }

    @GetMapping("/page")
    public Result<Page<Event>> findPage(@RequestParam(required = false, defaultValue = "1") Integer pageNum, @RequestParam(required = false, defaultValue = "10") Integer pageSize) {
        return Result.success(eventService.findPage(pageNum, pageSize));
    }
    @GetMapping("/{name}")
    public Result<Event> findById(@PathVariable String name) {
        return Result.success(eventService.findByName(name));
    }
}