package ch07.sec03.exam02;

public class Phone {
    public String model;
    public String color;

    public Phone(String model, String color){
        this.model = model;
        this.color = color;
        System.out.println("Phone 매개변수가 두개인 생성자가 실행됨");
    }
}
