package gr.aueb.cf.ch5Test;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = 0;
        int result = 0;

        System.out.println("give number: ");
        n = in.nextInt();
        result = facto(n);

        System.out.println("factorial of " + n + " is: " + result);
    }

    public static int facto(int n) {
       int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
}
}
