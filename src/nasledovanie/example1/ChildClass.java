package nasledovanie.example1;

public class ChildClass extends ParentClass{
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
}
