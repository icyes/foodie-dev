package com.imooc.controller;

import com.imooc.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StuFooController {
    @Autowired
    private IStuService stuService;

    @GetMapping("/getStu")
    public Object hello(int id) {
        return stuService.getStuById(id);
    }

    @PostMapping("/saveStu")
    public Object saveStu() {
        stuService.saveStu(null);
        return "OK";
    }

    @PostMapping("/updateStu")
    public Object updateStu() {
        stuService.updateStu(null);
        return "OK";
    }

    @PostMapping("/deleteStu")
    public Object deleteStu(int id) {
        stuService.deleteStuById(id);
        return "OK";
    }
}

