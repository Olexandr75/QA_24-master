package lesson2.nasledovanie.ex2;

public class Main {
    public static void main(String[] args) {
        //ChildClass child = new ChildClass();
        //System.out.println(child.parentInt);

        ParentClass parent = new ParentClass("String",2);
        ChildClass childClass = new ChildClass("String",2,"stringChild");
        childClass.howToMove();
        childClass.howToRead();
        System.out.println("============================");
        parent.howToMove();
        parent.howToRead();

        //ChildClass childClass1 = (ChildClass) new ParentClass("String",2);

    }
}
