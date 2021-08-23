package com.example.demo.service;

import com.example.demo.entity.Body;

import java.util.List;

public interface BodyService {
    Body saveOrUpdate(Body body);
    List<Body> findAll();
    Body findById(Long id);
}
