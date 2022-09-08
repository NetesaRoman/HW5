package models.obstacles;

import models.contestors.Contestor;

public class Track extends Obstacle {

    //constructor
    public Track(double length, String name) {
        super(length, name);
        this.isVertical = false;
    }

    //methods
    @Override
    public void overcome(Contestor contestor) {
        contestor.run(this);
    }
}
