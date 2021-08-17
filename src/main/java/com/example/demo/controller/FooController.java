package com.example.demo.controller;

import com.example.demo.entity.Foo;
import com.example.demo.service.FooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.Integer.valueOf;

@RestController
public class FooController {
    private final FooService fooService;

    @Autowired
    public FooController(final FooService fooService) {
        this.fooService = fooService;
    }

    @GetMapping("/foo/{id}")
    public Foo getFoobyID(@PathVariable("id") final String id) {
        return fooService.getById(valueOf(id));
    }
}
