package com.example.demo.dao;

import com.example.demo.models.DefaultThing;
import org.springframework.data.repository.CrudRepository;

public interface IDefaultDao extends CrudRepository<DefaultThing, Long>{
}