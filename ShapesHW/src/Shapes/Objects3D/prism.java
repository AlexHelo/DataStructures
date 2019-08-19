package Shapes.Objects3D;

import Shapes.Shape3D;

/**
 * prism
 */
public class prism extends Shape3D {
    double side;
    double area;
    double volume;
    double height;
    double perimeter;

    public prism() {
        super("Prism");
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getVolume() {
        return volume;
    }
}