package ch06.sec13.exam02.exam03.package1;

public class B {
    public void method(){
        A a = new A();
        a.field1 = 1;
        a.field2 = 1;
        //접근 제어가자가 private 이기 때문에 안됨.
        //a.field3 = 1;

        a.method1();
        a.method2();
        //a.method3();
    }
}
