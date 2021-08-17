package com.example.demo.service.impl;

import com.example.demo.entity.Foo;
import com.example.demo.repository.FooRepository;
import com.example.demo.service.FooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FooServiceImpl implements FooService {
    private final FooRepository fooRepository;

    @Autowired
    public FooServiceImpl(final FooRepository fooRepository) {
        this.fooRepository = fooRepository;
    }

    @Override
    public String doFoo(final String firstValue,
                        final String secondValue) {
        return firstValue + secondValue;
    }

    @Override
    public Foo saveOrUpdate(final Integer id, final String name) {
        return fooRepository.save(new Foo(id, name));
    }

    @Override
    public Foo getById(final Integer id) {
        return fooRepository.findById(id).orElse(null);
    }
}
