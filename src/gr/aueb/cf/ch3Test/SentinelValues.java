package gr.aueb.cf.ch3Test;

import java.util.Scanner;

public class SentinelValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int iterations = 1;

        System.out.println("Insert Number: (-1 for quit)");
        //number = input.nextInt();
        while ((number = input.nextInt()) != -1) {
            iterations++;
            System.out.println("Insert new number: ");
            //number = input.nextInt();

        }
        System.out.println("the number of counts is: " + iterations);
    }
}
