package com.how2java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.how2java.mapper.CategoryMapper;
import com.how2java.pojo.Category;
import com.how2java.service.CategoryService;
import com.how2java.util.Page;

/** 
 * @author  xiaomingHe
 * @date 创建时间：2018年7月24日 上午11:32:58 
 * @description
 */

@Service
public class CategoryServiceImpl implements CategoryService {
    
    @Autowired
    CategoryMapper mapper;
    
    @Override
    public List<Category> list() {
        return mapper.list();
    }

    @Override
    @Transactional(propagation=Propagation.REQUIRED,rollbackForClassName="Exception")
    public void addTwo() {
        Category c1 = new Category();
        c1.setName("短的名称");
        mapper.add(c1);
        
        Category c2 = new Category();
        c2.setName("名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,");
        mapper.add(c2);
        
    }

    @Override
    public void deleteAll() {
        List<Category> cs = list();
        for (Category c : cs) {
            mapper.delete(c.getId());
        }
    }

/*    @Override
    public int total() {
        return mapper.total();
    }

    @Override
    public List<Category> list(Page page) {
        return mapper.list(page);
    }*/
    
    
}
