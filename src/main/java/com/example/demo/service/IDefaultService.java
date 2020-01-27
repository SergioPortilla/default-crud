package com.example.demo.service;

import com.example.demo.models.DefaultThing;

import java.util.List;

public interface IDefaultService {

    public List<DefaultThing> findAll();

    public void save(DefaultThing defaultThing);

    public DefaultThing findOne(Long id);

    public void delete(DefaultThing defaultThing);
}
