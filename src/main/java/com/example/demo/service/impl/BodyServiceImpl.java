package com.example.demo.service.impl;

import com.example.demo.entity.Body;
import com.example.demo.repository.BodyRepository;
import com.example.demo.service.BodyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BodyServiceImpl implements BodyService {
    private final BodyRepository bodyRepository;

    @Autowired
    public BodyServiceImpl(final BodyRepository bodyRepository) {
        this.bodyRepository = bodyRepository;
    }

    @Override
    public List<Body> findAll() {
        return null;
    }

    @Override
    public Body findById(final Long id) {
        return null;
    }

    @Override
    public Body saveOrUpdate(final Body body) {
        return null;
    }
}
