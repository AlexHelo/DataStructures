package Shapes;

/**
 * Shape3D
 */
public abstract class Shape3D implements ShapeInterface {
    private String name;

    public Shape3D(String name) {
        this.name = name;
    }

    public abstract double getVolume();

}