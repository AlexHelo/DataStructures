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

    public void askQuestion() {

    }

    @Override
    public double getArea() {
        area = (sideC * height) / 2;
        return area;
    }

    @Override
    public double getPerimeter() {
        perimeter = (sideA + sideB + sideC);
        return perimeter;
    }

    @Override
    public double getVolume() {
        return 0;
    }
}