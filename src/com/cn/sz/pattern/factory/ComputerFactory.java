package com.cn.sz.pattern.factory;
/**
 * 
 * @author HuWeiLiang
 * @desc 设计模式-工厂模式  
 * @date 2017年6月6日
 * @time 下午2:15:57 
 * @email huweiliang@tydic.com
 */
public class ComputerFactory {
    
    public static Object getComputer(String className){
         try {
            return Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
