package com.company;

public class Triangle extends Shape {
    private int length;
    private int length2;
    private int base;

    public Triangle (int length,int base,int length2) {
        this.length = length;
        this.base = base;
        this.length2 = length2;
    }
    public double getPerimeter() {
        return length + base + length2;
    }
}