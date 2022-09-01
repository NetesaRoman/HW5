package models.shapes;

public class ShapeAreaAdder {
    //fields
    private Shape[] shapes;

    //constructor
    public ShapeAreaAdder(Shape[] shapes) {
        this.shapes = shapes;
    }

    //methods
    public double sumOfAllAreas() {
        double sum = 0;
        for (Shape s : shapes) {
            sum += s.getShapeArea();
        }
        return sum;
    }
}
