package behavioral.state;

public class PowerSaveState implements TransformerState {
    @Override
    public void move() {
        System.out.println("Move slowly");
    }

    @Override
    public void fire() {
        System.out.println("Fire slowly");
    }

    @Override
    public void fly() {
        System.out.println("Not flying in PowerSave Mode");
    }
}
