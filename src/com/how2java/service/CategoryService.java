package com.how2java.service;

import java.util.List;

import com.how2java.pojo.Category;
import com.how2java.util.Page;

/** 
 * @author  xiaomingHe
 * @date 创建时间：2018年7月24日 上午11:31:51 
 * @description
 */
public interface CategoryService {
    List<Category> list();
    
    //int total();
    
    //List<Category> list(Page page);
    
    void addTwo();
    
    void deleteAll();
    
}
