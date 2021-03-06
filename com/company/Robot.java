package com.company;

public class Robot extends AbstractRobot {
    private static int hitCount;
    private String name;

    public Robot(String name) {

        this.name = name;
    }

    public  String getName() {

        return name;
    }

    public BodyPart attack() {
        BodyPart attackedBodyPart = null;
        hitCount = hitCount + 1;

        if (hitCount == 1) {
            attackedBodyPart = BodyPart.ARM;
        } else if (hitCount == 2) {
            attackedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 3) {
            attackedBodyPart = BodyPart.CHEST;
        } else if (hitCount == 0) {
            attackedBodyPart = BodyPart.LEG;

            return attackedBodyPart;
        }

        BodyPart defendedBodyPart;


        {
            defendedBodyPart = null;
            hitCount = hitCount + 2;

            if (hitCount == 1) {
                defendedBodyPart = BodyPart.HEAD;
            } else if (hitCount == 2) {
                defendedBodyPart = BodyPart.LEG;
            } else if (hitCount == 3) {
                defendedBodyPart = BodyPart.CHEST;
            } else if (hitCount == 0) {
                defendedBodyPart = BodyPart.ARM;
            }
            defendedBodyPart = BodyPart.ARM;
        }
        return defendedBodyPart;
    }
}
