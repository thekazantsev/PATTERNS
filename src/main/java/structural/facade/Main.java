package structural.facade;

public class Main {
    public static void main(String[] args) {
        PaymentFacade buyingOperation = new PaymentFacade();
        buyingOperation.makePayment("Joke", 300.28);
    }
}
