package gr.aueb.cf.ch3Test;

import java.util.Scanner;

/**
 * Εναλλακτικά της do-while (truw)
 * και break
 */
public class DoMenu2App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;
        int condition = 5;

       while (condition > 0) {
           condition = 0;
           System.out.println("1.");
           System.out.println("2.");
           System.out.println("3.");
           System.out.println("4.");
           System.out.println("5.");
           choice = in.nextInt();
           if (choice == 5) break;
       }
        System.out.println("Ευχαριστούμε για την επιλογή της εφαρμογής μαςτ.");
    }
}
