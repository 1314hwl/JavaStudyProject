package com.cn.sz.reflex;

import java.io.Serializable;

public class User extends Human implements BaseHuman {

    /** @Fields serialVersionUID: */

    private static final long serialVersionUID = 6540602820959440582L;

    public String name;

    private int age;

    public User() {
        super();
    }

    public User(int id) {
        super(id);
    }

    public User(int id, String name) {
        this(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ",  id=" + getId() + ",  age=" + age +"]";
    }

}
