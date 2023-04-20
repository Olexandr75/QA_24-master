package lesson2.staticer.ex2;

public class StaticBlocker {
    static void justMethod(){
        System.out.println("Я просто метод");
    }
    static {
        System.out.println("Я статический блок");
    }
}
