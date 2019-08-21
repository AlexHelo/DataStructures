package Shapes.Objects2D;

import Shapes.Shape2D;

/**
 * polygon - 5 sides or above (1/2bh)
 */
public class polygon extends Shape2D {

    double side;
    double apothem;
    double numOfSides;
    double area;
    double perimeter;

    public polygon() {
        super("Polygon");
    }

    public double getArea() {
        area=((numOfSides*side*apothem)/2);
        return area;
    }

    public double getPerimeter() {
        perimeter=side*numOfSides;
        return perimeter;
    }

}