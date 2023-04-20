package lesson2.staticer.ex1;

public class ClassEx {
    static int staticNumber = 6;
     int nonStaticNumber = 8;

     public static void staticMethod(){
         System.out.println("Я статический");
     }
    public  void NonStaticMethod(){
        System.out.println("Я  не статический");
    }
    public static void staticMethod2(){
        System.out.println(staticNumber);
        //System.out.println(nonStaticNumber);
        //NonStaticMethod();
         staticMethod();
        System.out.println("Я статический2");
    }
    public  void NonStaticMethod2(){
        System.out.println(staticNumber);
        staticMethod2();
        System.out.println("Я  не статический2");
    }


}
