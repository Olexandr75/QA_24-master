package lesson2.abstraction.interfaces.ex1;

public class Bird implements Fly{
    @Override
    public void iCanFly() {
        System.out.println("Я птичка, я лечу");
    }
}
