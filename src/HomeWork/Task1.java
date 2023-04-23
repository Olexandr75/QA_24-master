package HomeWork;


import java.util.Arrays;

public class Task1 {

        public static void main(String[] args) {
            int[] arr = {2, 5, 5, 5, 8, 4, 5, 6, 8, 5};
            printOddNumbers(arr);
        }

        public static void printOddNumbers(int[] arr) {
            for (int x = 0; x < arr.length; x++)
                if (arr[x] % 2 != 0)
                {System.out.print(arr[x]+ " ");}

            System.out.println ();

            for (int x = 0; x < arr.length; x++)
                if (arr[x] %2 == 0){
                    {System.out.print(arr[x] + " ") ;
                    }}}}