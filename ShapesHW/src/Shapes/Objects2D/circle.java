package Shapes.Objects2D;

import Shapes.Shape2D;
import java.lang.Math;

/**
 * circle
 */
public class circle extends Shape2D {
    private double radius;
    private double area;
    private double perimeter;

    public circle(double radius) {
        super("Circle");
        this.radius=radius;
    }

    public double CalcArea(double radius){
        area=Math.PI*radius*radius;
        return area;
    }
    public double CalcPerimeter(double radius){
        perimeter=Math.PI*radius;
        return perimeter;
    }
}