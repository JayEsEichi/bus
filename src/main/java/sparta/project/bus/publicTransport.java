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

    public void setFuel_volume(int fuel_volume) {
        this.fuel_volume = fuel_volume;
    }

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


//    public String driveStart(){
//        return
//    }

//    public int changeSpeed(){
//        return
//    }
//

    public void transportNumDifference(int transport_num){
        int num = getTransport_num();

        if(num != transport_num){
            System.out.println("서로 다른 버스입니다.");
        }
    }


    // 승객 탑승 및 요금 확인 기능
    public void ride_passenger() {
        //1. 탑승 승객 수 = 2
        //2. 잔여 승객 수 = 28
        //3. 요금 확인 = 2000
        int remain_max_passenger = getMaximum_passenger() - getPassenger();
        setMaximum_passenger(remain_max_passenger);
        int now_price = getPassenger() * getPrice();

        System.out.println("탑승 승객 수 = " + getPassenger());
        System.out.println("잔여 승객 수 = " + remain_max_passenger);
        System.out.println("요금 확인 = " + now_price);
    }

    // 주유 기능
    public void fuelControl() {
        //1. 주유량 = 50
        int fuels = getFuel_volume() - getFuel();
        setFuel_volume(fuels);
//        String situation = getSituation();

        if(fuels < 10){
            this.situation = "차고지행";
            System.out.println("주유 필요");
            System.out.println("주유량 = " + fuels);
            System.out.println("상태 = " + situation);
        }else{
            this.situation = "운행중";
            System.out.println("주유량 = " + fuels);
        }

    }

    // 버스 운행 상태와 2차 주유량 확인 기능
    public void changeTransportSituation() {
        //1. 상태 = 차고지행
        //2. 주유량 = 60
        String situate = getSituation();
        setSituation(situate);
        int fuels = getFuel_volume() + getFuel();
        setFuel_volume(fuels);

        System.out.println("상태 = " + situate);
        System.out.println("주유량 = " + fuels);

    }

    public void changeDriveSituation(){
        String drive_situation = getSituation();
        int passenger_limit = getMaximum_passenger() - getPassenger();

        if(passenger_limit < 0){
            System.out.println("최대 승객 수 초과");
        }else{
            System.out.println("상태 = " + drive_situation);
            System.out.println("탑승 승객 수 = " + getPassenger());

            int remain_max_passenger = getMaximum_passenger() - getPassenger();
            setMaximum_passenger(remain_max_passenger);
            System.out.println("잔여 승객 수 = " + remain_max_passenger);
        }
    }


}
