package gr.aueb.cf.ch4Test;

import java.util.Scanner;

public class PowerApp {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

        int base = 0;
        int power = 0;
        int result = 1;

        System.out.println("Please inset base and power");
        base = in.nextInt();
        power = in.nextInt();

        for (int i = 1; i <= power; i++) {
           result *= base;
        }
        System.out.println("το γινόμενο του " + base + "^" + power + " είναι " + result);
    }
}
