package sparta.project.bus;

public class taxi extends publicTransport{

    int each_distance_price = 1000; // 거리 당 요금
    int basic_distance = 1; // 기본 거리
    String destination; // 목적지
    int destination_distance; // 목적지까지의 거리

    int passenger;

    taxi(int taxi_num,int maximum_passenger, int price, String situation, int fuel_volume ){
        setTransport_num(taxi_num);
        setMaximum_passenger(maximum_passenger);
        setPrice(price);
        setSituation(situation);
        setFuel_volume(fuel_volume);
    }


    void driveTaxi(){
        if(getFuel_volume() >= 10) {
            System.out.println("==============경계선==============");
            System.out.println("택시 번호 = " + getTransport_num());
            System.out.println("최대 승객 수 = " + getMaximum_passenger());
            System.out.println("탑승 승객 수 = " + passenger);
            System.out.println("잔여 승객 수 = " + (getMaximum_passenger() - passenger));
            System.out.println("주유량 = " + getFuel_volume());
            System.out.println("현재속도 = " + getSpeed());
            System.out.println("목적지 = " + destination);
            System.out.println("기본거리 = " + basic_distance);
            System.out.println("목적지까지의 거리 = " + destination_distance);
            System.out.println("지불할 요금 = " + ((getPrice() * passenger) + (each_distance_price * destination_distance)));
            System.out.println("기본 요금 = " + getPrice());
            System.out.println("거리당 요금 = " + (each_distance_price));
            System.out.println("상태 = " + getSituation());
            System.out.println("==============경계선==============");
        }else{
            return;
        }
    }

    void ridetaxiPassenger(int t_passenger, String destination, int destination_distance){
        if(getSituation().equals("일반") || t_passenger <= getMaximum_passenger()){
            setSituation("운행 중 (이 외의 다른 택시 사용 불가)");
            this.passenger = t_passenger;
            this.destination = destination;
            this.destination_distance = destination_distance;

            System.out.println("탑승 승객 수 = " + this.passenger);
            System.out.println("잔여 승객 수 = " + (getMaximum_passenger() - this.passenger));
            System.out.println("기본 요금 확인 = " + getPrice());
            System.out.println("목적지 = " + this.destination);
            System.out.println("목적지까지 거리 = " + this.destination_distance);
            System.out.println("지불할 요금 = " + (getPrice() + (this.destination_distance - basic_distance) * each_distance_price));
            System.out.println("상태 = " + getSituation());
            System.out.println();

        }else{
            System.out.println("탑승 불가");
            return;
        }
    }

    void ridetaxiPassenger(int t_passenger){
        if(t_passenger > getMaximum_passenger()){
            System.out.println("최대 승객 수 초과");
            System.out.println();
        }
    }


    void changeTaxiSituation(int fuel){
        setFuel_volume(getFuel_volume() + fuel);


        if(getFuel_volume() == 0){
            System.out.println("주유량 = " + getFuel_volume());
            setSituation("운행불가");
            System.out.println("상태 = " + getSituation());
            System.out.println("누적 요금 = " + (getPrice() + (this.destination_distance - basic_distance) * each_distance_price));
            System.out.println("주유 필요");

        }else{
            System.out.println("주유량 = " + getFuel_volume());
            System.out.println("누적 요금 = " + (getPrice() + (this.destination_distance - basic_distance) * each_distance_price));
        }

        System.out.println();
    }








}
