package com.example.demo.controller;

import com.example.demo.entity.Body;
import com.example.demo.service.BodyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/body")
public class BodyController {
    private final BodyService bodyService;

    @Autowired
    public BodyController(final BodyService bodyService) {
        this.bodyService = bodyService;
    }

    @GetMapping("/")
    public List<Body> findAll() {
        return bodyService.findAll();
    }

    @GetMapping("/{id}")
    public Body findById(@PathVariable("id") final Long id) {
        return bodyService.findById(id);
    }

    @PostMapping("/")
    public Body createOrUpdate(@RequestBody final Body body) {
        return bodyService.saveOrUpdate(body);
    }
}
