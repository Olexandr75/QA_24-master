package lesson2.abstraction.interfaces.ex1;

public interface Fly {
    void iCanFly();

    default void defoultMethod(){
        System.out.println("Я дефолтный метод");
    }
}
