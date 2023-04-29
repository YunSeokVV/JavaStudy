package ch07.serc07.exam01.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();

        //이 과정을 자동 타입변환이라고 한다. 자식 객체를 부모 객체 안에 넣어준다.
        Parent parent = child;

        parent.method1();
        parent.method2();
        //호출이 불가능하다. 왜냐하면 자동타입변환을 거치게 되면 자식객체의 내용을 더이상 사용할 수 없게 된다.
        //parent.method3();
    }
}
