package creational.abstractfactory.en;

import creational.abstractfactory.interfaces.Contract;

public class ContractEN implements Contract {
    @Override
    public void sign() {
        System.out.println("Contract signed");
    }
}
