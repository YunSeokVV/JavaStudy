package ch07.sec08.exam01;
// 필드의 다형성을 공부하기 위한 예제이다. 근데 이걸 보고 이해가 안되지는 않지만 혼자 쓰라고하면 절대 못쓸 것 같다. 근데 누가 짜놓은거 보는건 이해가 될듯.
//이 예제를 보고 드는 생각이 이렇게 쓰는 상황이 실제로 얼마나 있을까? 하는 생각이 든다. 이 생각이 잘못된건가?
public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.tire = new Tire();
        myCar.run();

        myCar.tire = new HankookTire();
        myCar.run();

        myCar.tire = new KumhoTire();
        myCar.run();
    }
}
