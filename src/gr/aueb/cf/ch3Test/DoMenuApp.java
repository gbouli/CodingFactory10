package gr.aueb.cf.ch3Test;

import java.util.Scanner;

/**
 * Εμφανίζει ένα μενού επιλογών στον χρήστη
 * μέχρι ο χρήστης να επιλέξει την επιλογή 0 (έξοδος)
 */
public class DoMenuApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

       do {
           System.out.println("1. Choice 1");
           System.out.println("2. Choice 2");
           System.out.println("3. Choice 3");
           System.out.println("4. Choice 4");
           System.out.println("5. Exit");
           choice = in.nextInt();
       } while (choice != 5);

        System.out.println("Ευχαριστούμε για την επιλογή της εφαρμογής μας");
    }
}
