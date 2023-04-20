package lesson2.staticer.ex3;

public class ClassStatickInit {
    static String day;

    static void thisIsMonday(){
        day ="Monday";
        System.out.println("Today is "+day);
    }
    static {
        day = "Friday";
        System.out.println("I love "+day);
    }
    static {
        day = "Tuesday";
        System.out.println("I love "+day);
    }
}
