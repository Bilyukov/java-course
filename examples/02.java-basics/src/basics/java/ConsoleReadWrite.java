package basics.java;

import java.util.Scanner;

public class ConsoleReadWrite {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in,"UTF-8");

        System.out.println("Моля въведете дума: ");
        String word = input.nextLine();

        System.out.println("Моля въведете целочислено число:");
        int numInt = input.nextInt();

        System.out.println("Моля въведете число с плаваща запетая:");
        double numDouble = input.nextDouble();

        System.out.println("Въведена дума: " + word);
        System.out.println("Въведено целочислено число: " + numInt);
        System.out.println("Въведено число с плаваща запетая: " + numDouble);
    }
}
