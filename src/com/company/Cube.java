package com.company;

public class Cube extends Shape {

    private int edge;

    public Cube (int edge) {

        this.edge = edge;

    }
    @Override
    public double getPerimeter() {
        return 12 * edge;
    }
}