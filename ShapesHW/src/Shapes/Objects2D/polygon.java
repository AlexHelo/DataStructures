package Shapes.Objects2D;

import Shapes.Shape2D;

/**
 * polygon - 5 sides or above (1/2bh)
 */
public class polygon extends Shape2D {

    double side;
    double height;
    double area;
    double perimeter;

    public polygon() {
        super("Polygon");
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

}