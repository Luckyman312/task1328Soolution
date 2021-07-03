package com.company;

public abstract class AbstractRobot implements CanAttack,CanDefend {
    @Override
    public BodyPart attack() {
        return null;
    }

    @Override
    public Object getName() {
        return null;
    }

    @Override
    public BodyPart defend() {
        return null;
    }
}
