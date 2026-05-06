package gr.aueb.cf.ch3Test;

import java.util.Scanner;

public class ErrorHandlingLinearization {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
        System.out.println("insert numerator:");
        numerator = input.nextInt();

        if (numerator == 0) {
            System.out.println("Invalid numerator, quiting ");
            System.exit(1);
        }

        System.out.println("Insert denominator");
        denominator = input.nextInt();

        if (denominator == 0) {
            System.out.println("Cannot devide with zero");
        }
        result = numerator / denominator;
        System.out.println("The result is: " + result);

    }
}
}
