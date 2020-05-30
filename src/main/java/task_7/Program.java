package task_7;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Ввести число");
        Integer number = new Scanner(System.in).nextInt();
        recurs(number);
}

public static int recurs(int number) {
        if (number < 1) {
            return 1;
        }
    System.out.println(number + "");
        return recurs(number -1);
    }
}