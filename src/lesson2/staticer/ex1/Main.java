package lesson2.staticer.ex1;

public class Main {
    public static void main(String[] args) {
        ClassEx object = new ClassEx();
        System.out.println(object.nonStaticNumber);
        System.out.println(ClassEx.staticNumber);
/*
        object.NonStaticMethod();
        ClassEx.staticMethod();
        ClassEx.staticMethod2();*/
        object.NonStaticMethod2();

    }
}
