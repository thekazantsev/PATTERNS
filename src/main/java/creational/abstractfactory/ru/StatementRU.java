package creational.abstractfactory.ru;

import creational.abstractfactory.interfaces.Statement;

public class StatementRU implements Statement {
    @Override
    public void fill() {
        System.out.println("Заявление заполнено");
    }
}
