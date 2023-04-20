package lesson2.abstraction.abstractClass.ex2;

public interface Fly {
    void iCanFly();

    default void defoultMethod(){
        System.out.println("Я дефолтный метод");
    }
}
