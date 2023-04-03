package workClass;

public class Computer {
    private int cost;
    private String name;
    private boolean hasKeyboard;

    public int getCost(){
        return cost;
    }
    public Computer(String name,int cost, boolean hasKeyboard){
        this.cost=cost;
        this.hasKeyboard=hasKeyboard;
        this.name=name;
    }
    public Computer(int cost,String name, boolean hasKeyboard){
        this.cost=cost;
        this.hasKeyboard=hasKeyboard;
        this.name=name;
    }
    public Computer(String name, boolean hasKeyboard){
        this.hasKeyboard=hasKeyboard;
        this.name=name;
    }
    public Computer(int cost, boolean hasKeyboard, String name){
        this(name,hasKeyboard);
        this.cost=cost;
    }
    public void setCost(int cost){
        this.cost=cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasKeyboard() {
        return hasKeyboard;
    }

    public void setHasKeyboard(boolean hasKeyboard) {
        this.hasKeyboard = hasKeyboard;
    }

    public void printSmth(){
        System.out.println("Я ничего не принимаю, и ничего не возвращаю");
    }
    public void printSmth2(String text,int number){
        System.out.println("Я пригимаю "+text+" "+ number);
    }
    public int printSmth3(int number){
        return number+4;
    }
    public int printSmth4(){
        return 4;
    }
}
