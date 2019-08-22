package Shapes;

/**
 * Shape3D
 */
public class Shape3D implements ShapeInterface {
    private String name;

    public Shape3D(String name) {
        this.name = name;
    }

    // Added methods because of the implementation, the class could be abstract to
    // avoid this, however, we need to instance it to be able to print the different
    // lists instead of having a giant switch statement in Main.
    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getVolume() {
        return 0;
    }

    public void selection() {
        System.out.println("3dYEAH");
    }

}