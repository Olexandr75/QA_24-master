package workClass;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*Computer computer = new Computer();
        System.out.println(computer.hasKeyboard);
        System.out.println(computer.cost);
        System.out.println(computer.name);
        /////
        computer.hasKeyboard=true;
        computer.cost=15000;
        computer.name="Asus";
        /////
        System.out.println(computer.hasKeyboard);
        System.out.println(computer.cost);
        System.out.println(computer.name);*/

        Computer computer2 = new Computer("Apple",50000,true);
        Computer computer3 = new Computer("Dell",true);
        System.out.println(computer3.getCost());
        Computer computer4 = new Computer(20000, "Acer",true);
        /*computer2.printSmth();
        computer2.printSmth2("Text",43);
        System.out.println(computer2.printSmth3(3)+4);*/

        System.out.println(computer2.getCost());
        /*computer2.setCost(2000);
        System.out.println(computer2.getCost());*/



    }
}
