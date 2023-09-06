package creational.abstractfactory.en;

import creational.abstractfactory.interfaces.Statement;

public class StatementEN implements Statement {
    @Override
    public void fill() {
        System.out.println("Statement filled");
    }
}
