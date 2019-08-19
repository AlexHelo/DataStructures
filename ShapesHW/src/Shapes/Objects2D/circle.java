package Shapes.Objects2D;

import Shapes.Shape2D;

/**
 * circle
 */
public class circle extends Shape2D {
    double radius;
    double area;
    double perimeter;

    public circle() {
        super("Circle");
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}