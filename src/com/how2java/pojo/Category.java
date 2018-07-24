package com.how2java.pojo;
/** 
 * @author  xiaomingHe
 * @date 创建时间：2018年7月24日 上午11:29:33 
 * @description
 */
public class Category {
    private int id;
    private String name;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Category [id=" + id + ", name=" + name + "]";
    }
    
}
