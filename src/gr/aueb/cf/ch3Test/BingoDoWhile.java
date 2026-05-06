package gr.aueb.cf.ch3Test;

import java.util.Scanner;

public class BingoDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int key = 13;
        int inputnum = 0;
        boolean bingo = false;

        do {
            System.out.println("Guess the bingo!");
            inputnum = input.nextInt();

            if (inputnum == key) {
                bingo = true;
                System.out.println("Congrats!");
            } else {
                System.out.println("Try again!");
            }
        } while (!bingo);
    }
}
