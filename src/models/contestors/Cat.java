package models.contestors;

import models.obstacles.Obstacle;

public class Cat extends Contestor {

    //constructor
    public Cat(String name) {
        super(name);
        this.runCapability = 1000;
        this.jumpCapability = 500;
    }

    //methods
    @Override
    public void run(Obstacle obstacle) {
        if (obstacle.getLength() > runCapability) {
            System.out.println(
                    "Cat named "
                            + this.name
                            + " couldn't run over the obstacle "
                            + obstacle.getName() + " Length: "
                            + obstacle.getLength() + " Distance "
                            + this.runCapability
            );
            this.lost = true;
        } else {
            System.out.println(
                    "Cat named "
                            + this.name
                            + " managed to run over the obstacle "
                            + obstacle.getName() + " Length: "
                            + obstacle.getLength()
            );
        }
    }

    @Override
    public void jump(Obstacle obstacle) {
        if (obstacle.getLength() > jumpCapability) {
            System.out.println(
                    "Cat named "
                            + this.name
                            + " couldn't jump over the obstacle "
                            + obstacle.getName() + " Height: "
                            + obstacle.getLength() + " Distance "
                            + this.jumpCapability
            );
            this.lost = true;
        } else {
            System.out.println(
                    "Cat named "
                            + this.name
                            + " managed to jump over the obstacle "
                            + obstacle.getName() + " Height: "
                            + obstacle.getLength()
            );
        }
    }
}
