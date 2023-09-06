package creational.abstractfactory.en;

import creational.abstractfactory.interfaces.Patent;

public class PatentEN implements Patent {
    @Override
    public void print() {
        System.out.println("Patent printed");
    }
}
