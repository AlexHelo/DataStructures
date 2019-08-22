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

    public static cube getQuestions(Scanner sc) {
        System.out.println("How long is the cube's side?");
        double side = sc.nextDouble();
        return new cube(side);
    }

    @Override
    public double getArea() {
        area = side * side * 6;
        return area;
    }

    @Override
    public double getPerimeter() {
        perimeter = side * 12;

        return perimeter;
    }

    @Override
    public double getVolume() {
        volume = side * side * side;
        return volume;
    }
}