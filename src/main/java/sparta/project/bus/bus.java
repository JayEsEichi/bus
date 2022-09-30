package sparta.project.bus;

public class bus {
    public static void main(String[] args) {
        int transport_num = 1; // 버스 번호
        int passenger = 0; // 현재 승객 수
        int maximum_passenger = 30; // 최대 승객 수
        String situation = "운행"; // 상태
        int price = 1000; // 요금
        int fuel = 0;

        publicTransport transport = new publicTransport();

        // 결과 1 : 서로 다른 버스인지 확인
        transport.setTransport_num(transport_num);
        transport_num = 2;
        transport.transportNumDifference(transport_num);

        System.out.println();

        // 결과 2 : 탑승 승객 수, 잔여 승객 수, 요금 확인
        transport.setMaximum_passenger(maximum_passenger);
        passenger = 2;
        transport.setPassenger(passenger);
        transport.setPrice(price);
        transport.ride_passenger();

        System.out.println();

        // 결과 3 : 주유량
        fuel = 50;
        transport.setFuel(fuel);
        transport.fuelControl();

        System.out.println();

        // 결과 4 : 상태, 2차 주유량
        situation = "차고지행";
        transport.setSituation(situation);
        fuel = 10;
        transport.setFuel(fuel);
        transport.changeTransportSituation();

        System.out.println();

        // 결과 5 : 승객 수 초과 여부
        situation = "운행중";
        transport.setSituation(situation);
        passenger = 45;
        transport.setPassenger(passenger);
        transport.changeDriveSituation();

        System.out.println();

        // 결과 6 : 탑승 승객 수, 잔여 승객 수, 요금 확인
        transport.setMaximum_passenger(maximum_passenger);
        passenger = 5;
        transport.setPassenger(passenger);
        transport.setPrice(price);
        transport.ride_passenger();

        System.out.println();

        fuel = 55;
        transport.setFuel(fuel);
        transport.fuelControl();


    }


}
