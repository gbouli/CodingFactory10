package gr.aueb.cf.ch3Test;

import java.util.Scanner;

public class FailureErrorHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 0;
        final int KEY = 13;

        System.out.println("Insert key:");
        num = input.nextInt();

        if (num != KEY) {
            System.out.println("Access Denied");
            System.exit(1);
        }
        System.out.println("Access Granted!");
    }
}
