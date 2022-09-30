package sparta.project.bus;

public class bus extends publicTransport {
    public static void main(String[] args) {

        int maximum_passenger = 30; // 최대 승객 수
        int passenger = 0; // 현재 승객 수
        int price = 1000; // 요금
        int fuel = 0;
        String situation = "운행 중"; // 상태
        int speed = 0;

        publicTransport transport = new publicTransport();
        bus b = new bus();

        final int bus_num = (int)(Math.random() * 1000);

        transport.setTransport_num(bus_num);
        transport.setMaximum_passenger(maximum_passenger);
        transport.setPassenger(passenger);
        transport.setPrice(price);
        transport.setFuel(fuel);
        transport.setSituation(situation);

        // 초기 운행
        b.busInformation(transport);

        // 1차 상태
        passenger = 2;
        b.ridePassenger(transport,passenger);
        b.busInformation(transport);

        // 2차 상태
        fuel = -50;
        b.changeBussituation(transport, fuel);
        b.busInformation(transport);

        // 3차 상태
        fuel = 10;
        b.changeBussituation(transport, fuel);
        b.busInformation(transport);

        // 4차 상태
        passenger = 45;
        b.ridePassenger(transport,passenger);
        b.busInformation(transport);

        // 5차 상태
        passenger = 5;
        b.ridePassenger(transport,passenger);
        b.busInformation(transport);

        // 6차 상태

    }


    // 승객 탑승
    public void ridePassenger(publicTransport transport, int passenger){
        if(transport.getMaximum_passenger() - passenger < 0){
            System.out.println("최대 승객 수 초과");
        }else {
            transport.setPassenger(transport.getPassenger() + passenger);
            transport.setMaximum_passenger(transport.getMaximum_passenger() - transport.getPassenger());
            transport.setPrice(transport.getPassenger() * 1000);

        }
    }

    // 버스 상태 변경
    public void changeBussituation(publicTransport transport, int fuel){
        int fuel_volume = transport.getFuel_volume();

        if(transport.getFuel_volume() <= 0 || fuel_volume > transport.getFuel_volume() + fuel){
            transport.setFuel_volume(transport.getFuel_volume() + fuel);
            transport.setSituation("차고지행");
        }else if(transport.getFuel_volume() < 10){
            transport.setSituation("주유가 필요하다");
        }else if(fuel_volume < transport.getFuel_volume() + fuel){
            transport.setFuel_volume(transport.getFuel_volume() + fuel);
            transport.setSituation("운행 중");
        }

    }

    // 버스 정보
    public void busInformation(publicTransport transport, int fuel){
        int fuel_volume = transport.getFuel_volume();

        if(transport.getFuel_volume() <= 0 || fuel_volume > transport.getFuel_volume() + fuel){
            transport.setFuel_volume(transport.getFuel_volume() + fuel);
            transport.setSituation("차고지행");
        }else if(transport.getFuel_volume() < 10){
            transport.setSituation("주유가 필요하다");
        }else if(fuel_volume < transport.getFuel_volume() + fuel){
            transport.setFuel_volume(transport.getFuel_volume() + fuel);
            transport.setSituation("운행 중");
        }

    }


    public void busInformation(publicTransport transport){
        System.out.println();
        System.out.println("[버스 상태 정보]");
        System.out.println("버스 번호 = " + transport.getTransport_num());
        System.out.println("최대 승객 수 = " + 30);
        System.out.println("탑승 승객 수 = " + transport.getPassenger());
        System.out.println("잔여 승객 수 = " + transport.getMaximum_passenger());
        System.out.println("요금 확인 = " + transport.getPrice());
        System.out.println("주유량 = " + transport.getFuel_volume());
        System.out.println("상태 = " + transport.getSituation());
        System.out.println();
    }



}


