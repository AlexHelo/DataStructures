package Shapes.Objects2D;

import Shapes.Shape2D;

/**
 * triangle
 */
public abstract class triangle extends Shape2D {
    double sideA;
    double sideB;
    double sideC;
    double height;
    double area;
    double perimeter;

    public triangle() {
        super("Triangle");
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}