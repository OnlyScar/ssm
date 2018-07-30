package com.how2java.util;

import java.util.Date;

/** 
 * @author  xiaomingHe
 * @date 创建时间：2018年7月24日 下午3:34:58 
 * @description
 */
public class DateUtil {
    public static void main(String[] args) {
        String str = "2018-6-8";
        Date date = DateFormatUtil.formatDate(str); 
        System.out.println(date);
        
    }
    
    /** 
     * 日期字符串转时间戳 
     * @param dateStr 
     * @return 
     */  
    public static Integer transForMilliSecond(String dateStr){  
        Date date = DateFormatUtil.formatDate(dateStr);  
        return date == null ? null : DateFormatUtil.transForMilliSecond(date);  
    }  
}
