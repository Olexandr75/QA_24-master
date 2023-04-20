package lesson2.staticer.ex4;

public class ClassA {

    public ClassA(){
        System.out.println("Конструктор класса A");
    }
    static {
        System.out.println("Статический блок A");
    }

    {
        System.out.println("Динамический блок A");
    }
}
