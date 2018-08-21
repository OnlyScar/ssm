package com.how2java.mapper;

import java.util.List;

import com.how2java.pojo.Product;
import com.how2java.util.Page;

/** 
 * @author  xiaomingHe
 * @date 创建时间：2018年8月21日 下午4:58:56 
 * @description
 */
public interface ProductMapper {
    
    public int add(Product product); 
    
    public void delete(int id); 
        
    public Product get(int id); 
      
    public int update(Product category);  
        
    public List<Product> list();
     
    public List<Product> list(Page page);
    
    public int total(); 
}
