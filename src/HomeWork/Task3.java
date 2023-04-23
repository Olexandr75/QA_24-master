package HomeWork;

public class Task3 {


    String type;
    int height;
    int coutOfsticks;
    String colour;

    public Task3 (String type, int height) {
        this.type = type;
        this.height = height;
        this.colour = "Зеленый";
        this.coutOfsticks = 13;
    }

    public Task3(int height, int coutOfsticks, String colour) {
        this.height = height;
        this.coutOfsticks = coutOfsticks;
        this.colour = colour;
        this.type = "пихта";
    }
    public Task3 ()
    {
        this.height = 350;
        this.coutOfsticks = 29;
        this.colour = "Желтый";
    }
    public Task3(String type) {
        this();
        this.type=type;
        }
public void printTask3 () {
    System.out.println(type);
    System.out.println(coutOfsticks);
    System.out.println(height);
    System.out.println(colour);
    }
    }

