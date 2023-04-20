package lesson2.methods;

public class Main {
    public static void main(String[] args) {
        Methods methods = new Methods();
        methods.print();
        int[] x = {1,2,3};
        String c = methods.count(x);
        System.out.println(c);
    }
}
