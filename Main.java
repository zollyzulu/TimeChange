package wctc.edu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter time one without colons (24 hour format): ");

        int timeOne = keyboard.nextInt();

        keyboard.nextLine();

        System.out.println("Enter time two without colons (24 hour format): ");

        int timeTwo = keyboard.nextInt();

        keyboard.nextLine();

        int timeDifference = Math.abs(timeOne - timeTwo);

        System.out.println("Here is the time difference: " + timeDifference);



       /* Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter time one: ");

        String timeOne = keyboard.nextLine();

        keyboard.nextLine();

        System.out.println("Enter time two: ");

        String timeTwo = keyboard.nextLine();

        keyboard.nextLine();



        int timeDifference = Math.abs(timeOne - timeTwo);

        System.out.println("Here is the time difference: " + timeDifference);*/
    }
}
