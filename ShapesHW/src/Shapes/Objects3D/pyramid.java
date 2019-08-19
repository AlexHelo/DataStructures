package Shapes.Objects3D;

import Shapes.Shape3D;

/**
 * pyramid aka Tetraedro
 */
public class pyramid extends Shape3D {
    double side;
    double area;
    double volume;
    double height;
    double perimeter;

    public pyramid() {
        super("Pyramid");
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