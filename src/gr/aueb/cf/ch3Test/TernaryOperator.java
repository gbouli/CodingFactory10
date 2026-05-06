package gr.aueb.cf.ch3Test;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            int num1 = 0;
            int abs = 0;

            System.out.println("Inser num:");
            num1 = in.nextInt();

            System.out.printf("abs of %d is %d ", num1, (num1 >= 0) ? num1 : -num1);
            System.out.println();
        }
    }
}
