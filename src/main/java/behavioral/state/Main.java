package behavioral.state;

public class Main {
    public static void main(String[] args) {
        Transformer optimusBee = new Transformer();

        optimusBee.setContext(new ActiveState());
        optimusBee.move();
        optimusBee.fire();
        optimusBee.fly();

        System.out.println("====================");

        optimusBee.setContext(new PowerSaveState());
        optimusBee.move();
        optimusBee.fire();
        optimusBee.fly();
    }
}
