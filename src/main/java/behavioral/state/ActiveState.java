package behavioral.state;

public class ActiveState implements TransformerState {
    @Override
    public void move() {
        System.out.println("Running fast");
    }

    @Override
    public void fire() {
        System.out.println("Rapid fire");
    }

    @Override
    public void fly() {
        System.out.println("Fury acceleration to the moon");
    }
}
