package com.cn.sz.faceview;

import groovy.transform.Synchronized;

/**
 * @Description 竹云网络面试题
 * @author HuWeiLiang
 * @date 2017年7月25日 下午4:15:25
 */
public abstract class FaceView001 {
    public static void main(String[] args) {
        
        
        
        int i=1;
        int j=i++;
        if((i>++j)&&(i++==j)){
            i+=j;
        }
        //问输出结果是多少？
        System.out.println(i);
        
        //###################################
        long var1=Math.round(11.5);
        long var2=Math.round(-11.5);
        System.out.println(var1);
        System.out.println(var2);
        //问输出结果是多少？
        //###################################
        
        String s="abcdefgjij";
        System.out.println(s.lastIndexOf("ef"));
        //问输出结果是多少？
        //###################################
        
        
        
        
        
    }
    
    public static final void m4(){
       
    }
    
    public abstract  void m5();
    
    
    
    
    public interface Test{
        public abstract void m4();
    }

}
