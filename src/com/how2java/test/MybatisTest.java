package com.how2java.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.how2java.mapper.ProductMapper;
import com.how2java.pojo.Product;

/** 
 * @author  xiaomingHe
 * @date 创建时间：2018年8月21日 下午6:07:02 
 * @description
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MybatisTest {
    
    @Autowired
    private ProductMapper mapper;
    
    @Test
    public void testAdd(){
        for (int i = 0; i < 50; i++) {
            Product p = new Product();
            p.setName("new product"+i);
            p.setPrice(100+(i++));
            mapper.add(p);
        }
        
    }
    
}
