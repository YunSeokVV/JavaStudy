package ch08.sec12;
// 인터페이스의 자료형 확인을 하는 예제이다.
public class InstanceOfExample {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        Bus bus = new Bus();

        ride(taxi);
        System.out.println();
        ride(bus);


    }

    //지금 SDK가 14버전이여서 아마 안되는가봄 ㅇㅇ
    public static void ride(Vehicle vehicle){
//        if(vehicle instanceof Bus bus){
//            bus.checkFare();
//        }

        // 인스턴스 객체가 Bus 타입인지 확인하는 조건문. 첫번째로 이 함수가 호출되는 시점에는 Taxi 객체가 들어오기 때문에 checkFare 메소드가 호출되지 않는다.
        if(vehicle instanceof Bus){
            Bus bus = (Bus) vehicle;
            bus.checkFare();
        }

        vehicle.run();
    }
}
