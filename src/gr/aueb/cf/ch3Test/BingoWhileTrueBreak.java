package gr.aueb.cf.ch3Test;

import java.util.Scanner;

public class BingoWhileTrueBreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputnum = 0;
        final int SECRET = 13;

        while (true) {
            System.out.println("Guess the bingo!");
            inputnum = input.nextInt();

            if (inputnum == SECRET) {
                System.out.println("Congrats!");
                break;
            } else {
                System.out.println("Try again!");
            }
        }
    }
}
