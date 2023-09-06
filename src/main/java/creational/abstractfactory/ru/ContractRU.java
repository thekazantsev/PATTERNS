package creational.abstractfactory.ru;

import creational.abstractfactory.interfaces.Contract;

public class ContractRU implements Contract {
    @Override
    public void sign() {
        System.out.println("Контракт подписан");
    }
}
