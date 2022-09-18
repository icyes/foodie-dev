package com.imooc.service;

import com.imooc.pojo.Stu;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description  
 * @Author  VVL
 * @Date 2022-09-18 07:17 
 */
public interface IStuService {

    @Transactional(propagation = Propagation.SUPPORTS)
    Stu getStuById(int id);

    public void saveStu(Stu stu);

    public void updateStu(Stu stu);

    public void deleteStuById(Integer id);

}
