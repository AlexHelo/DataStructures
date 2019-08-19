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

    public double getArea() {
        return area;
    }
    public void CalcArea(double radius){
        area=Math.PI*radius*radius;
        this.area=area;
    }
    public double getPerimeter() {
        return perimeter;
    }
    public void CalcPerimeter(double radius){
        perimeter=Math.PI*radius;
        this.perimeter=perimeter;
    }
}