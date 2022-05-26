package com.company;

public class Square extends Shape {
    private int sides;


    public Square (int sides) {
        this.sides = sides;

    }
    @Override
    public double getPerimeter() {
        return 4 * sides;
    }

}