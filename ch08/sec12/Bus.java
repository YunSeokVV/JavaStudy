package ch08.sec12;

public class Bus implements Vehicle{

    @Override
    public void run() {
        System.out.println("bus is running");
    }

    public void checkFare(){
        System.out.println("fare the fee");
    }
}
