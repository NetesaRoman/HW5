package models.obstacles;

import models.contestors.Contestor;

public class Wall extends Obstacle {

    //constructor
    public Wall(double length, String name) {
        super(length, name);
        this.isVertical = true;
    }

    //methods
    @Override
    public void Overcome(Contestor contestor) {
        contestor.jump(this);
    }
}
