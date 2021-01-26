package com.example.demo.entity;

/**
 * @Classname numbers
 * @Author GuOHuI
 * @Date 2021/1/25
 * @Time 21:50
 */
public class Numbers {
    private int a;
    private int b;

    public Numbers(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Numbers() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "numbers{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
