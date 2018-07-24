package com.how2java.test;

import java.util.List;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.how2java.mapper.CategoryMapper;
import com.how2java.pojo.Category;

/** 
 * @author  xiaomingHe
 * @date 创建时间：2018年7月24日 上午10:41:34 
 * @description
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Test {
    
    @Autowired
    private CategoryMapper mapper;
    
    @org.junit.Test
    public void testAdd() {
        Category c = new Category();
        c.setName("new c");
        mapper.add(c);
        
    }
    
    @org.junit.Test
    public void testList(){
        System.out.println(mapper);
        List<Category> cs = mapper.list();
        for (Category c : cs) {
            System.out.println(c.getName());
        }
        
    }
    
}
