package com.cn.sz.reflex.test;

public class Play {
    
    private int id;
    
    private String name;
    
    public final void playBall(int id,String name){
        this.id=id;
        this.name=name;
        System.out.println("id="+id+"   name="+name);
    }

}
