package creational.abstractfactory.ru;

import creational.abstractfactory.interfaces.Patent;

public class PatentRU implements Patent {
    @Override
    public void print() {
        System.out.println("Патент распечатан");
    }
}
