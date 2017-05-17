package com.cn.sz.meiju;

public class ColorEnum {

    private Color c = Color.RED;

    public static void main(String[] args) {
        ColorEnum colorEnum = new ColorEnum();
        switch (colorEnum.c) {
        case GREEN:
            System.out.printf("绿色");
            break;
        case YELLOW:
            System.out.printf("黄色");
            break;
        case RED:
            System.out.printf("红色");
            break;
        case WHITE:
            System.out.printf("白色");
            break;
        }
    }

    enum Color {
        GREEN, YELLOW, RED, WHITE
    }

}
