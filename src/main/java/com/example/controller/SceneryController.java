package com.example.controller;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.io.IoUtil;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;
import com.example.common.Result;
import com.example.entity.Scenery;
import com.example.entity.User;
import com.example.service.SceneryService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/scenery")
public class SceneryController {
    @Resource
     private SceneryService sceneryService;

    @PostMapping
    public Result<Scenery> save(@RequestBody Scenery scenery) {
        return Result.success(sceneryService.save(scenery));
    }

    @PutMapping
    public Result<?> update(@RequestBody Scenery scenery) {
        return Result.success(sceneryService.save(scenery));
    }

    @DeleteMapping("/{id}")
    public Result<?> delete(@PathVariable Long id) {
        sceneryService.delete(id);
        return Result.success();
    }

    @GetMapping("/{id}")
    public Result<Scenery> findById(@PathVariable Long id) {
        return Result.success(sceneryService.findById(id));
    }

    @GetMapping
    public Result<List<Scenery>> findAll() {
        return Result.success(sceneryService.findAll());
    }

    @GetMapping("/page")
    public Result<Page<Scenery>> findPage(@RequestParam(required = false, defaultValue = "1") Integer pageNum, @RequestParam(required = false, defaultValue = "10") Integer pageSize) {
        return Result.success(sceneryService.findPage(pageNum, pageSize));
    }


    @GetMapping("/export")
    public void export(HttpServletResponse response) throws IOException {

        List<Map<String, Object>> list = CollUtil.newArrayList();

        List<Scenery> all = sceneryService.findAll();
        for (Scenery scenery : all) {
            Map<String, Object> row1 = new LinkedHashMap<>();
            row1.put("景点名称", scenery.getName());
            row1.put("景点地址", scenery.getLocation());
            row1.put("景点类型", scenery.getType());
            row1.put("景点介绍", scenery.getIntroduce());
            list.add(row1);
        }

        // 2. 写excel
        ExcelWriter writer = ExcelUtil.getWriter(true);
        writer.write(list, true);

        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;charset=utf-8");
        String fileName = URLEncoder.encode("景点表", "UTF-8");
        response.setHeader("Content-Disposition", "attachment;filename=" + fileName + ".xlsx");

        ServletOutputStream out = response.getOutputStream();
        writer.flush(out, true);
        writer.close();
        IoUtil.close(System.out);
    }
}