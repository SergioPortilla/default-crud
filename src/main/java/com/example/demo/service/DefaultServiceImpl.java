package com.example.demo.service;

import com.example.demo.dao.IDefaultDao;
import com.example.demo.models.DefaultThing;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

public class DefaultServiceImpl implements IDefaultService{

    @Autowired
    private IDefaultDao defaultDao;

    @Override
    @Transactional
    public List<DefaultThing> findAll() {
        return (List<DefaultThing>) defaultDao.findAll();
    }

    @Override
    @Transactional
    public void save(DefaultThing defaultThing) {
        defaultDao.save(defaultThing);
    }

    @Override
    @Transactional
    public DefaultThing findOne(Long id) {
        return defaultDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(DefaultThing defaultThing) {
        defaultDao.delete(defaultThing);
    }
}
