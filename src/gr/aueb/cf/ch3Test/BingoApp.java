package gr.aueb.cf.ch3Test;

import java.util.Scanner;

public class BingoApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bingo = 13;
        int num = 0;

        System.out.println("Guess the number: ");
        num = input.nextInt();

        while (num != bingo) {
            System.out.println("Try again!");
            num = input.nextInt();
        }
        System.out.println("Congrats");
    }
}
