package sparta.project.bus;

public class publicTransport {

    int transport_num = 0;
    int fuel_volume = 100;
    int speed = 0;
    int change_speed = 0;
    int maximum_passenger = 0;
    int passenger = 0;
    int fuel = 0;
    int price = 0;
    String situation = "";


    // getter
    public int getTransport_num() {
        return transport_num;
    }

    public int getFuel_volume() {
        return fuel_volume;
    }

    public int getSpeed() {
        return speed;
    }

    public int getChange_speed() {
        return change_speed;
    }

    public int getMaximum_passenger() {
        return maximum_passenger;
    }

    public int getFuel() { return fuel; }

    public String getSituation() { return situation; }

    public int getPassenger() { return passenger; }

    public int getPrice() { return price; }


    // setter
    public void setTransport_num(int transport_num) {
        this.transport_num = transport_num;
    }

    public void setFuel_volume(int fuel_volume) { this.fuel_volume = fuel_volume; }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setChange_speed(int change_speed) {
        this.change_speed = change_speed;
    }

    public void setMaximum_passenger(int maximum_passenger) {
        this.maximum_passenger = maximum_passenger;
    }

    public void setFuel(int fuel) { this.fuel = fuel; }

    public void setSituation(String situation) { this.situation = situation; }

    public void setPassenger(int passenger) { this.passenger = passenger; }

    public void setPrice(int price) { this.price = price; }


}
