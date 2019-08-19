package Shapes.Objects3D;

import Shapes.Shape3D;

/**
 * sphere
 */
public class sphere extends Shape3D {
    double side;
    double area;
    double volume;
    double height;
    double perimeter;

    public sphere() {
        super("Sphere");
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