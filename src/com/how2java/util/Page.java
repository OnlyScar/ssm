package com.how2java.util;
/** 
 * @author  xiaomingHe
 * @date 创建时间：2018年7月24日 下午1:18:36 
 * @description
 */
public class Page {
    int start = 0;
    int count = 5;
    int last = 0;
    public int getStart() {
        return start;
    }
    public void setStart(int start) {
        this.start = start;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public int getLast() {
        return last;
    }
    public void setLast(int last) {
        this.last = last;
    }
    
    public void calculateLast(int total){
        if (0==total%count) {
            last = total - count;
        }
        else{
            last = total - total % count;
        }
    }
}
