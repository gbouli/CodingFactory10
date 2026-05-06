package gr.aueb.cf.ch3Test;

import java.util.Scanner;

public class FactorialApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 1;
        int factorial = 1;
        int n = 0;

        System.out.println("Insert Factorial:");
        n = input.nextInt();

        while (i <= n) {
            factorial *= i;
            i++;
        }
        System.out.println("the result is: " + factorial);
    }
}
