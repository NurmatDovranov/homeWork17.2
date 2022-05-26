package com.company;

public class Main {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(10,4,17);
        System.out.println("Perimeter of Triangle is: " + (int)triangle.getPerimeter());

        Cube cube = new Cube(11);
        System.out.println("Perimeter of Cube is: " + cube.getPerimeter());

        Circle circle = new Circle(23);
        System.out.println("Perimeter of Circle is: " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle(8,12);
        System.out.println("Perimeter of Rectangle is: " + rectangle.getPerimeter());

        Square square = new Square(8);
        System.out.println("Perimeter of Square is: " + square.getPerimeter());

    }
}