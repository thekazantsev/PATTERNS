package creational.abstractfactory.en;

import creational.abstractfactory.interfaces.Contract;
import creational.abstractfactory.interfaces.DocumentFactory;
import creational.abstractfactory.interfaces.Patent;
import creational.abstractfactory.interfaces.Statement;

public class DocumentFactoryEN implements DocumentFactory {
    @Override
    public Contract getContract() {
        return new ContractEN();
    }

    @Override
    public Patent getPatent() {
        return new PatentEN();
    }

    @Override
    public Statement getStatement() {
        return new StatementEN();
    }
}
