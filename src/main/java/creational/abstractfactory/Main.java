package creational.abstractfactory;

import creational.abstractfactory.en.DocumentFactoryEN;
import creational.abstractfactory.enums.Area;
import creational.abstractfactory.interfaces.Contract;
import creational.abstractfactory.interfaces.DocumentFactory;
import creational.abstractfactory.interfaces.Patent;
import creational.abstractfactory.interfaces.Statement;
import creational.abstractfactory.ru.DocumentFactoryRU;

public class Main {
    public static void main(String[] args) {
        DocumentFactory docFactory = null;
        Statement statement;
        Patent patent;
        Contract contract;
        Area area = Area.RU;

        switch (area) {
            case EN -> docFactory = new DocumentFactoryEN();
            case RU -> docFactory = new DocumentFactoryRU();
        }

        statement = docFactory.getStatement();
        patent = docFactory.getPatent();
        contract = docFactory.getContract();

        statement.fill();
        patent.print();
        contract.sign();
    }
}
