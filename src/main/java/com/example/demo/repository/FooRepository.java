package com.example.demo.repository;

import com.example.demo.entity.Foo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FooRepository extends JpaRepository<Foo, Integer> {

    @Query("select foo from Foo foo where foo.name = :searchValue")
    List<Foo> findAllByName(@Param("searchValue") String searchValue);
}
