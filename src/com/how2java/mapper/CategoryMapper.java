package com.how2java.mapper;

import java.util.List;

import com.how2java.pojo.Category;

/** 
 * @author  xiaomingHe
 * @date 创建时间：2018年7月24日 上午10:37:36 
 * @description
 */
public interface CategoryMapper {
    
    public int add(Category category); 
    
    public void delete(int id); 
        
    public Category get(int id); 
      
    public int update(Category category);  
        
    public List<Category> list();
     
    
    public int count(); 
}
