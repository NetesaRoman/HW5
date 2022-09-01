package models.obstacles;

public class Track extends Obstacle {

    //constructor
    public Track(double length, String name) {
        super(length, name);
        this.isVertical = false;
    }
}
