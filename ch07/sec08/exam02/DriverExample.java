package ch07.sec08.exam02;
// 매개변수의 다형성을 연습하기 위한 예제이다.
public class DriverExample extends Vehicle{
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        driver.drive(bus);

        Taxi taxi = new Taxi();
        driver.drive(taxi);
    }
}
