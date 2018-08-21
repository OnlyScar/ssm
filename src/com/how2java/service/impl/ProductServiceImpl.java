package com.how2java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2java.mapper.ProductMapper;
import com.how2java.pojo.Product;
import com.how2java.service.ProductService;
import com.how2java.util.Page;

/** 
 * @author  xiaomingHe
 * @date 创建时间：2018年8月21日 下午5:40:46 
 * @description
 */

@Service
public class ProductServiceImpl implements ProductService {
    
    @Autowired
    ProductMapper mapper;
    
    @Override
    public List<Product> list() {
        
        return mapper.list();
    }

    @Override
    public int total() {
        // TODO Auto-generated method stub
        return mapper.total();
    }

    @Override
    public List<Product> list(Page page) {
        // TODO Auto-generated method stub
        return mapper.list(page);
    }

    @Override
    public void add(Product p) {
        // TODO Auto-generated method stub
        mapper.add(p);
    }

    @Override
    public void update(Product p) {
        // TODO Auto-generated method stub
        mapper.update(p);
    }

    @Override
    public void delete(Product p) {
        // TODO Auto-generated method stub
        mapper.delete(p.getId());
    }

    @Override
    public Product get(int id) {
        // TODO Auto-generated method stub
        return mapper.get(id);
    }
    
}
