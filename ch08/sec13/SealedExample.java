package ch08.sec13;
// 무분별한 자식인터페이스 객체 생성을 막기 위해서 sealed 예약어를 공부하는 예제이다.
public class SealedExample {
    public static void main(String[] args) {
        ImplClass impl = new ImplClass();

        InterfaceA ia =impl;
        ia.methodA();
        System.out.println();
        InterfaceB ib =impl;
        ib.methodA();
        ib.methodB();
        System.out.println();
        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
