package Shapes.Objects2D;

import java.util.Scanner;

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

    public static circle getQuestions(Scanner sc) {
        System.out.println("What's the sphere's radius");
        double radius = sc.nextDouble();
        return new circle(radius);
    }

    @Override
    public double getArea() {
        area = ((numOfSides * side * apothem) / 2);
        return area;
    }

    @Override
    public double getPerimeter() {
        perimeter = side * numOfSides;
        return perimeter;
    }

    @Override
    public double getVolume() {
        return 0;
    }

}