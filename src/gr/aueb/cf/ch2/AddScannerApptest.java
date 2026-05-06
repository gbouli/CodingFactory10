package gr.aueb.cf.ch2;

import java.util.Scanner;

public class AddScannerApptest {
    public static void main(String[] args) {

        int num1 =0;
        int num2 = 0;
        int sum =0;

        Scanner input = new Scanner(System.in);
        System.out.println("Import Two Numbers: ");
        num1 = input.nextInt();
        num2 = input.nextInt();

        System.out.println("The Numbers are: " + num1 + " και " + num2);

        sum = num1 + num2;
        System.out.println("The sum is " + sum);
    }
}
