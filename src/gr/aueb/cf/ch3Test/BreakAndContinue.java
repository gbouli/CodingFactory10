package gr.aueb.cf.ch3Test;

import java.util.Scanner;
public class BreakAndContinue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        int sum = 0;

        while (true) {
            System.out.println("Insert Number: ");
            num = input.nextInt();
            if (num == 5) {
                continue;
            }
            sum += num;
            if (num == 10) {
                break;
            }
            System.out.println("the sum is " + sum);
        }
    }
}
