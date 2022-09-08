package models.contestors;

import models.obstacles.Obstacle;

public abstract class Contestor {
    //fields
    protected double runCapability;
    protected double jumpCapability;
    protected String name;
    protected boolean lost = false;

    //constructor
    public Contestor(String name) {
        this.name = name;
    }

    //methods
    public abstract void run(Obstacle obstacle);

    public abstract void jump(Obstacle obstacle);

    public boolean getLost() {
        return lost;
    }



}
