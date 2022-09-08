package view;

import models.contestors.*;
import models.obstacles.*;
import models.shapes.*;

public class Main {
    public static void main(String[] args) {

        Circle c1 = new Circle(4);
        Square s1 = new Square(2);
        Triangle t1 = new Triangle(1.2, 4);

        Shape c2 = new Circle(12);
        Shape s2 = new Square(6);
        Shape t2 = new Triangle(1.8, 3);

        Shape[] shapes = {c1, c2, s1, s2, t1, t2};
        ShapeAreaAdder saa = new ShapeAreaAdder(shapes);

        System.out.println("-------------------------TASK1------------------------------");
        System.out.println("Area of circle 1: " + c1.getShapeArea());
        System.out.println("Area of circle 2: " + c2.getShapeArea());
        System.out.println("Area of square 1: " + s1.getShapeArea());
        System.out.println("Area of square 2: " + s2.getShapeArea());
        System.out.println("Area of triangle 1: " + t1.getShapeArea());
        System.out.println("Area of triangle 2: " + t2.getShapeArea());
        System.out.println("sum of all areas: " + saa.sumOfAllAreas());

        Contestor[] contestors = {new Human("Petro"), new Robot("C3PO"), new Cat("Barsik")};

        Wall w1 = new Wall(100, "Small brick wall");
        Wall w2 = new Wall(500, "High wooden wall");
        Wall w3 = new Wall(700, "High brick wall");
        Wall w4 = new Wall(300, "Small wooden wall");
        Wall w5 = new Wall(400, "Medium brick wall");

        Track tr1 = new Track(100, "Short track");
        Track tr2 = new Track(1000, "Long track");
        Track tr3 = new Track(500, "Medium track");
        Track tr4 = new Track(800, "Curved track");
        Track tr5 = new Track(400, "Slippery track");

        Obstacle[] route = {tr1, w1, tr3, w5, w2, tr5, tr4, w4, tr2, w3};
        System.out.println("-------------------------TASK2------------------------------");
        for (Contestor contestor : contestors) {
            for (Obstacle obstacle : route) {

                if (contestor.getLost()) break;
            }
        }

    }
}