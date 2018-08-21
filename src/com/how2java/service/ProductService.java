package com.how2java.service;

import java.util.List;

import com.how2java.pojo.Product;
import com.how2java.util.Page;

/** 
 * @author  xiaomingHe
 * @date 创建时间：2018年8月21日 下午5:39:46 
 * @description
 */
public interface ProductService {
    List<Product> list();
    
    int total();
    List<Product> list(Page page);
    
    void add(Product p);
    void update(Product p);
    void delete(Product p);
    Product get(int id);
    
}
