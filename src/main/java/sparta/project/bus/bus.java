package sparta.project.bus;

public class bus extends publicTransport {

    int passenger; // 현재 승객 수

    bus(int bus_num1, int maximum_passenger, int price, String situation){
        setTransport_num(bus_num1);
        setMaximum_passenger(maximum_passenger);
        setPrice(price);
        setSituation(situation);
        driveBus();
    }

    void driveBus() {
        System.out.println("===============경계선=================");
        System.out.println("버스 번호 = " + getTransport_num());
        System.out.println("최대 승객 수 = " + getMaximum_passenger());
        System.out.println("현재 승객 수 = " + passenger);
        System.out.println("잔여 승객 수 = " + (getMaximum_passenger() - passenger));
        System.out.println("요금 = " + getPrice());
        System.out.println("주유량 = " + getFuel_volume()); // 대중교통 기본값
        System.out.println("현재 속도 = " + getSpeed()); // 대중교통 기본값
        System.out.println("상태 = " + getSituation());
        System.out.println("===============경계선=================");
    }


    void changeBusSituation(int fuel) {
        int first_fuel_volume = getFuel_volume();
        setFuel_volume(getFuel_volume() + fuel);

        if(getFuel_volume() <= 0 || first_fuel_volume > getFuel_volume()) {
            setSituation("차고지행");
            setFuel_volume(getFuel_volume());

            System.out.println("주유량 = " + getFuel_volume());

            if(getFuel_volume() < 10){
                System.out.println("주유 필요");
            }
            System.out.println();

        }else if(first_fuel_volume < getFuel_volume()){
            System.out.println("상태 = " + getSituation());
            System.out.println("주유량 = " + getFuel_volume());
            System.out.println();

            setSituation("운행 중");

        }

    }

    void ridePassenger(int passenger) {
        if(getMaximum_passenger() - passenger >= 0){
            this.passenger = passenger;
            setPrice(this.passenger * getPrice());

            System.out.println("탑승 승객 수 = " + this.passenger);
            System.out.println("잔여 승객 수 = " + (getMaximum_passenger() - this.passenger));
            System.out.println("요금 = " + getPrice());
            System.out.println();

            setPrice(getPrice() / this.passenger);
            return;

        }else if(getMaximum_passenger() - passenger < 0){
            System.out.println("!!!!최대 승객 수 초과!!!!");
            System.out.println();
            return;
        }

    }

//    void changeSpeed(int fuel){
//        if(getFuel_volume() - fuel >= 10){
//
//        }else if(getFuel_volume() - fuel < 10){
//            System.out.println("주유 필요");
//            System.out.println();
//        }
//    }



}


