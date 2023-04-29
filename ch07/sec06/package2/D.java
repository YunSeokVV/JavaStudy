package ch07.sec06.package2;
import ch07.sec06.package1.A;
public class D extends A{
    // 상속을 통해서만 사용이 가능하다.
    public D(){
        super();
    }

    public void method1(){
        this.field = "value";
        this.method();
    }

    public void method2() {
        //직접 객체 생성해서 사용하는 것은 안된다.
//        A a = new A();
//        a.field = "value";
//        a.metod();
    }
}
