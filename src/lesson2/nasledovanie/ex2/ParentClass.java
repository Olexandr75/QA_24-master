package lesson2.nasledovanie.ex2;

public class ParentClass {
    String parentString;
    int parentInt;

    public ParentClass(String parentString, int parentInt) {
        this.parentString = parentString;
        this.parentInt = parentInt;
    }
    //public ParentClass(){}

    public void parentMethods(){
        System.out.println("I am parent method");
    }
    public void howToMove(){
        System.out.println("Я уверенно шагаю");
    }
    public void howToRead(){
        System.out.println("Я читаю газеты");
    }
}
