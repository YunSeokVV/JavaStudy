package ch07.serc07.exam01.exam02;

public class Child extends Parent{
    //메소드 오버라이딩
    @Override
    public void method2(){
        System.out.println("Child-method2()");
    }

    public void method3(){
        System.out.println("Child-method3()");
    }
}
