package models.obstacles;

public class Wall extends Obstacle {

    //constructor
    public Wall(double length, String name) {
        super(length, name);
        this.isVertical = true;
    }
}
