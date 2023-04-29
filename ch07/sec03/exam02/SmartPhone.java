package ch07.sec03.exam02;

public class SmartPhone extends Phone{

    public SmartPhone(String model, String color) {
        super(model, color);
        System.out.println("SmartPhone 클래스에서 생성자 클래스가 실행됨");
    }
}
