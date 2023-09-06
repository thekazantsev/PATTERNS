package structural.facade;

public class PaymentFacade {

    public void makePayment(String good, double price) {
        new PaymentTerminal().readCard(price);
        new NetworkModule().sendRequest(good, price);
        new CheckPrinter().printCheck(good, price);
    }
}
