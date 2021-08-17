package com.example.demo.service;

import com.example.demo.entity.Foo;
import org.springframework.stereotype.Service;

@Service
public interface FooService {
    /**
     * @param firstValue
     * @param secondValue
     * @return some concat value
     */
    String doFoo(String firstValue, String secondValue);

    Foo saveOrUpdate(Integer id, String name);

    Foo getById(Integer id);
}
