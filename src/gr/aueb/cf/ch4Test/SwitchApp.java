package gr.aueb.cf.ch4Test;

import java.util.Scanner;

public class SwitchApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int choice = 0;
        final int EXIT = 5;

        do {
            System.out.println("choice 1");
            System.out.println("choice 2");
            System.out.println("choice 3");
            System.out.println("choice 4");
            System.out.println("choice 5");

            choice = in.nextInt();

            switch (choice) {
                case 1 -> System.out.println("you chose 1");
                case 2 -> System.out.println("you chose 2");
                case 3 -> System.out.println("you chose 3");
                case 4 -> System.out.println("yu chose 4");
                case EXIT -> System.out.println("you chose to exit");
                default -> System.out.println("you made a bad choice");
            }
        } while (choice != 0);
    }
}