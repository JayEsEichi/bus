package sparta.project.bus;

public class bus extends publicTransport {
    int maximum_passenger = 30; // 최대 승객 수
    int passenger; // 현재 승객 수
    int price = 1000; // 요금
    int transport_num = (int)(Math.random() * 1000); // 버스 번호
    int fuel; // 주유량
    int speed; // 속도
    String situation = "운행 중"; // 상태

    publicTransport transport = new publicTransport();

    void driveBus() {
        transport.setTransport_num(transport_num);
        transport.setMaximum_passenger(maximum_passenger);

        System.out.println();
        System.out.println("버스 번호 = " + transport.getTransport_num());
        System.out.println("최대 승객 수 = " + transport.getMaximum_passenger());
        System.out.println("현재 승객 수 = " + passenger);
        System.out.println("잔여 승객 수 = " + (transport.getMaximum_passenger() - passenger));
        System.out.println("요금 = " + (price * passenger));
        System.out.println("주유량 = " + transport.getFuel_volume());
        System.out.println("현재 속도 = " + transport.getSpeed());
        System.out.println("상태 = " + situation);

    }


    void changeBusSituation(int fuel) {
        int first_fuel_volume = this.fuel_volume;
        transport.setFuel_volume(fuel_volume + fuel);

        if(transport.getFuel_volume() <= 0 || first_fuel_volume > transport.getFuel_volume()) {
            this.situation = "차고지행";
            this.fuel_volume = transport.getFuel_volume();

        }else if(first_fuel_volume < transport.getFuel_volume()){
            this.situation = "운행 중";
            this.fuel_volume = transport.getFuel_volume();
        }
        driveBus();
    }

    void ridePassenger(int passenger) {
        if(maximum_passenger - passenger >= 0 && situation == "운행 중"){
            this.passenger = this.passenger + passenger;
        }else if(maximum_passenger - passenger < 0){
            System.out.println("!!!!최대 승객 수 초과!!!!");
        }

        driveBus();
    }



    void changeSpeed(int fuel) {
        if(transport.getFuel_volume() + fuel < 10) {
            System.out.println("주유가 필요하다.");
            this.situation = "차고지행";
            this.fuel_volume = transport.getFuel_volume();
        }

        driveBus();
    }

}


