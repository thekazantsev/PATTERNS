package creational.abstractfactory.ru;

import creational.abstractfactory.interfaces.Contract;
import creational.abstractfactory.interfaces.DocumentFactory;
import creational.abstractfactory.interfaces.Patent;
import creational.abstractfactory.interfaces.Statement;

public class DocumentFactoryRU implements DocumentFactory {
    @Override
    public Contract getContract() {
        return new ContractRU();
    }

    @Override
    public Patent getPatent() {
        return new PatentRU();
    }

    @Override
    public Statement getStatement() {
        return new StatementRU();
    }
}
