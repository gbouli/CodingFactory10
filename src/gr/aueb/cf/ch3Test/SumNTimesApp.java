package gr.aueb.cf.ch3Test;

import java.util.Scanner;
public class SumNTimesApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;
        int i = 1;
        int n = 0;

        System.out.println("Insert Number: ");
        n = in.nextInt();

        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("The sum is: " + sum);
    }
}
