package lesson2.staticer.ex4;

public class ClassB extends ClassA {
    public ClassB(){
        System.out.println("Конструктор класса B");
    }
    static {
        System.out.println("Статический блок B");
    }

    {
        System.out.println("Динамический блок B");
    }
}
