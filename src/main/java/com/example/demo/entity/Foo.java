package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Table(name = "foo")
public class Foo {
    @Id
    @GeneratedValue(strategy = AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    public Foo() {
    }

    public Foo(final Integer id, final String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
