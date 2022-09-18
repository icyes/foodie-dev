package com.imooc.controller;

import com.imooc.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StuFooController {
    @Autowired
    private IStuService stuService;

    @GetMapping("/getStu")
    public Object hello(int id) {
        return stuService.getStuById(id);
    }
}
