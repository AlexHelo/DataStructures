package Shapes.Objects2D;

import Shapes.Shape2D;

/**
 * square
 */
public class square extends Shape2D {
    double side;
    double area;
    double perimeter;

    public square() {
        super("Square");
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}