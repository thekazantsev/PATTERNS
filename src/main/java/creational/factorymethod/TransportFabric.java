package creational.factorymethod;

public class TransportFabric {
    public static Transport getTransport(Road roadType) {
        Transport transport = null;
        switch (roadType) {
            case ASPHALT -> transport = new Car();
            case RAILS -> transport = new Train();
            case LAWN -> transport = new Bike();
        }

        return transport;
    }
}
