package creational.factorymethod;

public class Main {
    public static void main(String[] args) {

        Transport transport;

        transport = TransportFabric.getTransport(Road.ASPHALT);
        transport.drive();
        transport.stop();

        transport = TransportFabric.getTransport(Road.RAILS);
        transport.drive();
        transport.stop();

        transport = TransportFabric.getTransport(Road.LAWN);
        transport.drive();
        transport.stop();
    }
}
