package models.obstacles;

import models.contestors.Contestor;

public abstract class Obstacle {

    //fields
    protected boolean isVertical;
    protected double length;
    protected String name;

    //constructor
    public Obstacle(double length, String name) {
        this.length = length;
        this.name = name;
    }

    //methods
    public boolean getIsVertical() {
        return isVertical;
    }

    public double getLength() {
        return length;
    }

    public String getName() {
        return this.name;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public abstract void Overcome(Contestor contestor);
}
