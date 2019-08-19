package Shapes.Objects2D;

import Shapes.Shape2D;

/**
 * square
 */
public class square extends Shape2D {
    private double side;
    private double area;
    private double perimeter;

    public square(double side) {
        super("Square");
        this.side=side;
    }

    public double getArea() {
        return area;
    }
    public void calcArea(double side){
        area=side*side;
    }

    public double getPerimeter() {
        return perimeter;
    }
    public void calcPerimeter(double side){
        perimeter=4*perimeter;
    }
}