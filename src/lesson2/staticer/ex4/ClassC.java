package lesson2.staticer.ex4;

public class ClassC extends ClassB {
    public ClassC(){
        System.out.println("Конструктор класса C");
    }
    static {
        System.out.println("Статический блок C");
    }

    {
        System.out.println("Динамический блок C");
    }
}
