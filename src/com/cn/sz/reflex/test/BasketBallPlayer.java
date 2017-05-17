package com.cn.sz.reflex.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BasketBallPlayer extends Play {

    private static final Class<?>[] mPlayParamterTypes = new Class[] { int.class, String.class };

    public static void main(String[] args) {
        BasketBallPlayer bbp = new BasketBallPlayer();
        try {
            bbp.test();
        } catch (NoSuchMethodException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void test() throws NoSuchMethodException, SecurityException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException {
        try {
            Class<Play> p = (Class<Play>) Class.forName("com.cn.sz.reflex.test.Play");
            Method mPlay = p.getMethod("playBall", mPlayParamterTypes);
            Object[] mArgs = new Object[2];
            mArgs[0] = 100;
            mArgs[1] = "basketBall";
            mPlay.invoke(BasketBallPlayer.this, mArgs);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
