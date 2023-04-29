package ch07.sec04.exam01;

import static ch07.sec04.exam01.Computer.*;

public class Calculator {

    private Computer computer;
    Calculator(){}

    public void setComputer(Computer computer){
        this.computer = computer;
    }

    public Computer getComputer() {
        System.out.println("컴퓨터를 출력합니다");
        return this.computer;
    }

    public String getString(){
        return "이 컴퓨터는 "+this.computer.test()+"입니다.";
    }
//    public double areaCircle(double r){
//        System.out.println("Calculator 객체의 areaCircle() 실행");
//
//        testMethod();
//        getComputer().testMethod();
//        return 3.14159 * r * r;
//    }


}
