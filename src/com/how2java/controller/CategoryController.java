package com.how2java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.how2java.pojo.Category;
import com.how2java.service.CategoryService;
import com.how2java.util.Page;

/** 
 * @author  xiaomingHe
 * @date 创建时间：2018年7月24日 上午11:35:25 
 * @description
 */
@Controller
@RequestMapping("")
public class CategoryController {
    
    @Autowired
    CategoryService service;
    
    @RequestMapping("listCategory")
    public ModelAndView listCategory(Page page){
        ModelAndView mav = new ModelAndView();
        
       /* List<Category> cs = service.list(page);
        int total = service.total();
        page.calculateLast(total);
        mav.addObject("cs",cs);*/
        
        PageHelper.offsetPage(page.getStart(), 5);
        List<Category> cs = service.list();
        int total = (int) new PageInfo<Category>(cs).getTotal();
        page.calculateLast(total);
        
        mav.addObject("cs",cs);
        
        mav.setViewName("listCategory");
        
        return mav;
    }
    
}
