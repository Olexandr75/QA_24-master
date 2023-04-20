package lesson2.abstraction.abstractClass.ex2;

public class Auto extends Vehicles implements Interface, Fly {
    @Override
    public void move() {
        System.out.println("Я еду");
    }

    @Override
    public void iCanFly() {
        System.out.println("Я не могу летать я Авто");
    }
}
