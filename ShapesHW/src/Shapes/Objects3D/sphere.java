package Shapes.Objects3D;

import java.util.Scanner;

import Shapes.Shape3D;

/**
 * sphere
 */
public class sphere extends Shape3D {
    double radius;
    double area;
    double volume;
    double perimeter;

    Scanner sc = new Scanner(System.in);

    public sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }

    public static sphere getQuestions() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's the sphere's radius");
        double radius = sc.nextDouble();
        return new sphere(radius);
    }

    @Override
    public double getArea() {
        area = 12.566 * (area * area);
        return area;
    }

    @Override
    public double getPerimeter() {
        perimeter = 0;
        // Spheres don't have a perimeter
        return perimeter;
    }

    @Override
    public double getVolume() {
        volume = 4.189 * (radius * radius * radius);
        return volume;
    }
}