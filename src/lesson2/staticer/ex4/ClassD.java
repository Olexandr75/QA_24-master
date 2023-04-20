package lesson2.staticer.ex4;

public class ClassD extends ClassC {

    public ClassD(){
        System.out.println("Конструктор класса D");
    }
    static {
        System.out.println("Статический блок D");
    }

    {
        System.out.println("Динамический блок D");
    }
}
