package ch07.DI;

public class MainClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(new JungAcDiscount());

    }
}
