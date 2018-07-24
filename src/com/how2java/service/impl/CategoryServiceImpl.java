package com.how2java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2java.mapper.CategoryMapper;
import com.how2java.pojo.Category;
import com.how2java.service.CategoryService;

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
    
}
