package com.cn.sz.reflex;

import java.io.Serializable;

public class Human implements Serializable {

    /** @Fields serialVersionUID: */

    private static final long serialVersionUID = 5456903173439759062L;

    public int id;
    
    public Human(){
        
    }

    public Human(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
