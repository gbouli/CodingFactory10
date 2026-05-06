package gr.aueb.cf.ch3Test;

import java.util.Scanner;

public class PowerApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = 0;
        int b = 0;
        long result = 1;
        int i = 1;

        System.out.println("Insert number and power:");
        a = input.nextInt();
        b = input.nextInt();

        while (i<=b) {
            i++;
            result *= a;
        }
        System.out.printf("%d to the power of %d equals %d", a, b, result);
    }
}
