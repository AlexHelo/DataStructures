package Shapes.Objects3D;

import java.util.Scanner;
import Shapes.Shape3D;

/**
 * prism
 */
public class cube extends Shape3D {
    double side;
    double area;
    double volume;
    double perimeter;
    Scanner sc = new Scanner(System.in);

    public cube(double side) {
        super("Cube");
        this.side = side;
    }

    public cube getQuestions() {
        System.out.println("How long is the cube's side?");
        side = sc.nextDouble();
        return new cube(side);
    }

    public double getArea() {
        area = side * side * 6;
        return area;
    }

    public double getPerimeter() {
        perimeter = side * 12;

        return perimeter;
    }

    public double getVolume() {
        volume = side * 3;
        return volume;
    }
}