package ch08.sec13;

public class ImplClass implements InterfaceC{
    @Override
    public void methodA() {
        System.out.println("A method runned");
    }

    @Override
    public void methodB() {
        System.out.println("B method runned");
    }

    @Override
    public void methodC() {
        System.out.println("C method runned");
    }
}
