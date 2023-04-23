package HomeWork;

public class Mane {
    public static void main(String[] args) {
        Task3 tree1 = new Task3 ("Смерека", 20);
        tree1.printTask3();
        System.out.println();
        Task3 tree2 = new Task3 (20, 40, "Желтый" );
        tree2.printTask3();
        System.out.println();
        Task3 tree3 = new Task3 ();
        tree3.printTask3();
        System.out.println();
        Task3 tree4 = new Task3 ("Смерека");
        tree4.printTask3();
    }
}
