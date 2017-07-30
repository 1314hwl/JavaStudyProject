package com.cn.sz.pattern.build;

/**
 * @author HuWeiLiang
 * @desc Andriod build模式：实际上很多的安卓框架都使用的build模式设计。
 * @date 2017年7月6日
 * @time 下午3:57:59
 * @email huweiliang@tydic.com
 */
public class BuilderTest {

    public static void main(String[] args) {
        Person.Builder builder = new Person.Builder();
        Person p = builder.name("test").age(20).address("wuhan").build();
        System.out.println(p);
    }

}
