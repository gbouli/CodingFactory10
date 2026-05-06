package gr.aueb.cf.ch3Test;

import java.util.Scanner;

public class GenericWhile {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int start = 0;
        int endValue = 0;
        int step = 0;
        int counter = 0;

        System.out.println("Instert star, endValue and step");
        start = in.nextInt();
        endValue = in.nextInt();
        step = in.nextInt();

        while (start <= endValue) {
            counter += 1;
            start += step;
        }
        System.out.println("Iterations count: " + counter);
    }
}
