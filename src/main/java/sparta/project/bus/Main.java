package sparta.project.bus;

public class Main {
    public static void main(String[] args) {
        // 버스
        int bus_num1 = (int)(Math.random() * 1000);
        int bus_num2 = (int)(Math.random() * 1000);
        int maximum_passenger = 30; // 최대 승객 수
        int price = 1000; // 요금
        String situation = "운행 중";


        if(bus_num1 != bus_num2){
            bus b = new bus(bus_num1, maximum_passenger, price, situation);

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




        // 택시
        int taxi_num1 = (int)(Math.random() * 1000);
        int taxi_num2 = (int)(Math.random() * 1000);
        int t_maximum_passenger = 4; // 최대 승객 수
        int t_price = 3000; // 요금
        String t_situation = "일반"; // 상태
        int fuel_volume = 100;

        if(taxi_num1 != taxi_num2){
            taxi t = new taxi(taxi_num1, t_maximum_passenger, t_price, t_situation, fuel_volume);

            t.driveTaxi();

            int t_passenger = 2;
            String destination = "서울역";
            int destination_distance = 2;
            t.ridetaxiPassenger(t_passenger, destination, destination_distance);
        }






    }
}
