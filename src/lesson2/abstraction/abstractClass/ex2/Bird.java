package lesson2.abstraction.abstractClass.ex2;

public class Bird implements Fly {
    @Override
    public void iCanFly() {
        System.out.println("Я птичка, я лечу");
    }
}
