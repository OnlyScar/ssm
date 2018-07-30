package com.how2java.test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.how2java.mapper.CategoryMapper;
import com.how2java.service.CategoryService;

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
    
    @Autowired
    private CategoryService service;
    
 /*   @org.junit.Test
    public void testAdd() {
        Category c = new Category();
        c.setName("new c");
        mapper.add(c);
        
    }*/
    
   /* @org.junit.Test
    public void testList(){
        System.out.println(mapper);
        List<Category> cs = mapper.list();
        for (Category c : cs) {
            System.out.println(c.getName());
        }
        
    }*/
    
    @org.junit.Test
    public void testListPage() {
       /* Page p = new Page();
        p.setStart(0);
        p.setCount(5);
        List<Category> cs=mapper.list(p);
        for (Category c : cs) {
            System.out.println(c.getName());
        }*/
     }
    
    @org.junit.Test
    public void testAddTwo(){
        service.deleteAll();
        service.addTwo();
    }
    
    
}
