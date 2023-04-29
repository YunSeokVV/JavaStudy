package ch07.sec08.exam01;
// 필드 다형성을 표현하기 위한 예제
public class Car {
    public Tire tire;
    public void run(){
        tire.roll();
    }
}
