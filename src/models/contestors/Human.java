package models.contestors;

import models.obstacles.Obstacle;

public class Human extends Contestor {

    //constructor
    public Human(String name) {
        super(name);
        this.runCapability = 500;
        this.jumpCapability = 100;
    }

    //methods
    @Override
    protected void run(Obstacle obstacle) {
        if (obstacle.getLength() > runCapability) {
            System.out.println(
                    "Human named "
                            + this.name
                            + " couldn't run over the obstacle "
                            + obstacle.getName() + " Length: "
                            + obstacle.getLength() + "Distance "
                            + this.runCapability
            );
            this.lost = true;
        } else {
            System.out.println(
                    "Human named "
                            + this.name
                            + " managed to run over the obstacle "
                            + obstacle.getName() + " Length: "
                            + obstacle.getLength()
            );

        }
    }

    @Override
    protected void jump(Obstacle obstacle) {
        if (obstacle.getLength() > jumpCapability) {
            System.out.println(
                    "Human named "
                            + this.name
                            + " couldn't jump over the obstacle "
                            + obstacle.getName() + " Height: "
                            + obstacle.getLength() + "Distance "
                            + this.jumpCapability
            );
            this.lost = true;
        } else {
            System.out.println(
                    "Human named "
                            + this.name
                            + " managed to jump over the obstacle "
                            + obstacle.getName() + " Height: "
                            + obstacle.getLength()
            );

        }
    }


}
