package com.imooc.service.impl;

import com.imooc.mapper.StuMapper;
import com.imooc.pojo.Stu;
import com.imooc.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StuServiceImpl implements IStuService {
    @Autowired
    private StuMapper stuMapper;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Stu getStuById(int id) {
        return stuMapper.selectByPrimaryKey(id);
    }

    @Override
    public void saveStu(Stu stu) {

    }

    @Override
    public void updateStu(Stu stu) {

    }

    @Override
    public void deleteStuById(Integer id) {

    }
}

