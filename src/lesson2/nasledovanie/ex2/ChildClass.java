package lesson2.nasledovanie.ex2;

public class ChildClass extends ParentClass {
    String childString;

   /*public ChildClass(String parentString, int parentInt) {
        super(parentString, parentInt);
    }
*/
    public ChildClass(String parentString, int parentInt, String childString) {
        super(parentString, parentInt);
        this.childString = childString;
    }

    public void childMethod(){
        System.out.println("child method");
        super.parentMethods();
        System.out.println(super.parentInt);
    }
    @Override
    public void howToMove(){
        System.out.println("Я ползаю");
    }
    @Override
    public void howToRead(){
        System.out.println("Мама читает мне сказки");
    }
}
