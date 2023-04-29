package ch07.sec04.exam01;

public class Container {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setComputer(new ComputerImpl());
        System.out.println(calculator.getString());
    }
}
