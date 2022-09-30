package sparta.project.bus;

public class taxi extends publicTransport{

    int each_distance_price = 1000; // 거리 당 요금
    int basic_distance = 1; // 기본 거리
    String destination; // 목적지
    int destination_distance; // 목적지까지의 거리
    int passenger;

    publicTransport transport = new publicTransport();

    taxi(int taxi_num,int maximum_passenger, int price, String situation, int fuel_volume ){
        transport.setTransport_num(taxi_num);
        transport.setMaximum_passenger(maximum_passenger);
        transport.setPrice(price);
        transport.setSituation(situation);
        transport.setFuel_volume(fuel_volume);
    }


    void driveTaxi(){
        if(transport.getFuel_volume() >= 10) {
            System.out.println();
            System.out.println("택시 번호 = " + transport.getTransport_num());
            System.out.println("최대 승객 수 = " + transport.getMaximum_passenger());
            System.out.println("탑승 승객 수 = " + passenger);
            System.out.println("잔여 승객 수 = " + (transport.getMaximum_passenger() - passenger));
            System.out.println("주유량 = " + transport.getFuel_volume());
            System.out.println("현재속도 = " + transport.getSpeed());
            System.out.println("목적지 = " + destination);
            System.out.println("기본거리 = " + basic_distance);
            System.out.println("목적지까지의 거리 = " + destination_distance);
            System.out.println("기본 요금 = " + transport.getPrice());
            System.out.println("거리당 요금 = " + (transport.getPrice() * destination_distance));
            System.out.println("상태 = " + transport.getSituation());
        }else{
            return;
        }
    }

    void ridetaxiPassenger(int t_passenger, String destination, int destination_distance){
        if(transport.getSituation().equals("일반")){
            transport.setSituation("운행 중");
            this.passenger = this.passenger + t_passenger;
            this.destination = destination;
            this.destination_distance = destination_distance;
            driveTaxi();
        }else{
            System.out.println("탑승 불가");
            return;
        }
    }

    void changeTaxiSpeed(){

    }






}
