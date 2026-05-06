package gr.aueb.cf.ch3Test;

import java.util.Scanner;

public class ToThePowerOf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = 0;
        int power = 0;
        int count = 1;
        int result = 1;

        System.out.println("insert number and power:");
        number = in.nextInt();
        power = in.nextInt();

        while (count <= power) {
            result *= number;
            count++;
        }

        System.out.printf("%d ^ %d = %d ", number, power, result);
    }
}
