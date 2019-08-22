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

    public triangle(double sideA, double sideB, double sideC) {
        super("Triangle");
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public void askQuestion() {

    }

    public static triangle getQuestions(Scanner sc) {
        System.out.println("What's the first side of the triangle? (Longest side)");
        double sideA = sc.nextDouble();
        System.out.println("What's the second side of the triangle?");
        double sideB = sc.nextDouble();
        System.out.println("What's the third side of the triangle?");

        double sideC = sc.nextDouble();
        return new triangle(sideA, sideB, sideC);
    }

    @Override
    public double getArea() {
        area = (sideA * height) / 2;
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