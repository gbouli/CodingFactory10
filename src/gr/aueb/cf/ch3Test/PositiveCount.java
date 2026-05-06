package gr.aueb.cf.ch3Test;

import java.util.Scanner;

public class PositiveCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int count = 1;

        System.out.println("Insert Number: (negative number terminates loop)");
        number = input.nextInt();
        while (number >=0) {
            System.out.println("Insert new number: ");
            number = input.nextInt();
            count++;
        }
        System.out.println("the number of counts is: " + count);
    }
}
