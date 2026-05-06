package gr.aueb.cf.ch3Test;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 0;
        int inputNumber = 0;
        int digits = 0;

        System.out.println("Insert InputNumber:");
        inputNumber = input.nextInt();
        num = inputNumber;

        do {
            num /= 10;
            digits++;
        } while (num > 0);

        System.out.printf("The number of digits in %d is %d", inputNumber, digits);
    }
}
