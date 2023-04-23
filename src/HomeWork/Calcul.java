package HomeWork;

import java.util.Scanner;

public class Calcul {
    public void sum (double a, double b) {
        System.out.println("Сумма = " + (a+b));
            }
    public void minus (double a, double b) {
        System.out.println("Вычитание = " + (a-b));
    }
    public void multiply (double a, double b) {
        System.out.println("Умножение = " + (a*b));
    }
    public void division (double a, double b) {
        System.out.println("Деление = " + (a/b));
    }
    public void start () {
        System.out.println("калькулятор запущен");
        Scanner calc= new Scanner(System.in);
        String action;
        System.out.println("ваше действие");
        action = calc.nextLine();
        while (!action.equalsIgnoreCase("Stop")){
            if (action.contains("+")) {
                double number1 = Double.parseDouble(action.split("\\+")[0]);
                double number2 = Double.parseDouble(action.split("\\+")[1]);
                sum(number1,number2);
            }
            else if (action.contains("-")) {
                double number1 = Double.parseDouble(action.split("\\-")[0]);
                double number2 = Double.parseDouble(action.split("\\-")[1]);
                minus(number1,number2);
            }
            else if (action.contains("*")) {
                double number1 = Double.parseDouble(action.split("\\*")[0]);
                double number2 = Double.parseDouble(action.split("\\*")[1]);
                multiply(number1,number2);
            }
            else if (action.contains("/")) {
                double number1 = Double.parseDouble(action.split("\\/")[0]);
                double number2 = Double.parseDouble(action.split("\\/")[1]);
                division(number1,number2);
            }
            else {
                System.out.println("Введите корректное действие");
            }
            System.out.println("ваше действие");
            action = calc.nextLine();
        }
        System.out.println("Калькулятор закрыт");


    }

    public static void main(String[] args) {
        Calcul calc= new Calcul();
        calc.start();

    }
}

