package com.how2java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.how2java.pojo.Product;
import com.how2java.service.ProductService;
import com.how2java.util.Page;

/** 
 * @author  xiaomingHe
 * @date 创建时间：2018年8月21日 下午5:42:21 
 * @description
 */

@Controller
@RequestMapping("")
public class ProductController {
    
    @Autowired
    ProductService service;
    
    @RequestMapping("listProduct")
    public ModelAndView listProduct(Page page){
        ModelAndView mav = new ModelAndView();
        List<Product> ps = service.list(page);
        
        int total = service.total();
        
        page.calculateLast(total);
        
        mav.addObject("ps",ps);
        mav.setViewName("listProduct");
        
        return mav;
    }
    
    @RequestMapping("addProduct")
    public ModelAndView addCategory(Product c){
        service.add(c);
        ModelAndView mav = new ModelAndView("redirect:/listProduct");
        return mav;
    }
    
    @RequestMapping("deleteProduct")
    public ModelAndView deleteCategory(Product c) {
        service.delete(c);
        ModelAndView mav = new ModelAndView("redirect:/listProduct");
        return mav;
    }
    
    @RequestMapping("editProduct")
    public ModelAndView editCategory(Product product){
        Product p = service.get(product.getId());
        ModelAndView mav = new ModelAndView("editProduct");
        mav.addObject("p",p);
        return mav;
    }
    
    @RequestMapping("updateProduct")
    public ModelAndView updateCategory(Product c){
        service.update(c);
        ModelAndView mav = new ModelAndView("redirect:/listProduct");
        return mav;
    }
    
    
}
