package com.cn.sz.pattern.factory;

import org.junit.Test;

public class FactoryTest {

    @Test
    public void test() {
        Computer computer=(Computer)ComputerFactory.getComputer(Apple.class.getName());
        System.out.println(computer.name());
    }

}
