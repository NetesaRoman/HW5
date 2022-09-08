package models.contestors;

import models.obstacles.Obstacle;

public class Robot extends Contestor {

    //constructor
    public Robot(String name) {
        super(name);
        this.runCapability = 300;
        this.jumpCapability = 700;
    }

    //methods
    @Override
    public void run(Obstacle obstacle) {
        if (obstacle.getLength() > runCapability) {
            System.out.println(
                    "Robot named "
                            + this.name
                            + " couldn't run over the obstacle "
                            + obstacle.getName() + " Length: "
                            + obstacle.getLength() + " Distance "
                            + this.runCapability
            );
            this.lost = true;
        } else {
            System.out.println(
                    "Robot named "
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
                    "Robot named "
                            + this.name
                            + " couldn't jump over the obstacle "
                            + obstacle.getName() + " Height: "
                            + obstacle.getLength() + " Distance "
                            + this.jumpCapability
            );
            this.lost = true;
        } else {
            System.out.println(
                    "Robot named "
                            + this.name
                            + " managed to jump over the obstacle "
                            + obstacle.getName() + " Height: "
                            + obstacle.getLength()
            );

        }
    }
}
