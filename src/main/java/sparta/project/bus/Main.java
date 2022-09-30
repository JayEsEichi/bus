package sparta.project.bus;

public class Main {
    public static void main(String[] args) {

        bus b = new bus();
        b.driveBus();

        int passenger = 2;
        b.ridePassenger(passenger);

        int fuel = -50;
        b.changeBusSituation(fuel);

        fuel = 10;
        b.changeBusSituation(fuel);

        passenger = 45;
        b.ridePassenger(passenger);

        passenger = 5;
        b.ridePassenger(passenger);

        fuel = -55;
        b.changeSpeed(fuel);
    }
}
