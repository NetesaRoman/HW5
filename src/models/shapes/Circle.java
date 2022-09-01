package models.shapes;

public class Circle implements Shape {
    //fields
    private double radius;

    //constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    //methods
    @Override
    public double getShapeArea() {
        return (radius * radius) * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


}
