package models.shapes;

public class Square implements Shape {
    //fields
    private double edge;

    //constructor
    public Square(double edge) {
        this.edge = edge;
    }

    //methods
    @Override
    public double getShapeArea() {
        return edge * edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

}
