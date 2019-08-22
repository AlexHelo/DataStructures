package Shapes.Objects2D;

import java.util.Scanner;

import Shapes.Shape2D;

/**
 * triangle
 */
public class triangle extends Shape2D {
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

    public static triangle getQuestions(Scanner sc) {
        System.out.println("What's the first side of the rieangle radius");
        double radius = sc.nextDouble();
        return new triangle();
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