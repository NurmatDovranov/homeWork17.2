package com.company;

public class Circle extends Shape {
    private double pi = Math.PI;
    private double radius;
    public Circle (double radius) {
        if (radius < 0) {

            System.out.println("\nRadius of must be more than zero: " + radius+"\n");
        }
        this.radius = radius;
    }
    @Override
    public double getPerimeter() {
        return  2 * radius * pi ;
    }
}