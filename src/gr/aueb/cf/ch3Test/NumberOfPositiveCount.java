package gr.aueb.cf.ch3Test;

import java.util.Scanner;

public class NumberOfPositiveCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = 0;
        int iterations = 0;

        System.out.println("Give num: (-1 to quit)");
        num = in.nextInt();

        while ((num = in.nextInt()) != -1) {
            iterations++;
            System.out.println("Please, give num: ");
        }
        System.out.printf("%d iterations", iterations);
    }
}
