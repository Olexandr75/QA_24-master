package peregruz;

public class Peregruz {
    int x;


    public void peregruz(){
        String string;
        System.out.println("Я пустой метод");
    }
    public void peregruz(String string){
        System.out.println("Я не пустой метод. У меня строка "+string);
    }
    public void peregruz(String string,int number){
        System.out.println("Я не пустой метод." +
                " У меня строка "+string+" и у меня число "+number);
    }
    public void peregruz(int number, String string){
        System.out.println("Я не пустой метод." +
                " У меня строка "+string+" и у меня число "+number);
    }
    public void peregruz(int number, String string, String string2){
        peregruz(string2,number);
        System.out.println("И еще есть строка "+string);
    }
    static void example(){
        System.out.println("acacac");
    }

    public static void main(String[] args) {
        example();
        Peregruz per = new Peregruz();
        per.peregruz();
    }

}
