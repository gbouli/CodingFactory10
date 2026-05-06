package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει έναν ακέραιο. Το πρόγραμμα υπολογίζει
 * το απόλυτο του ακεραίου. Το απόλυτο ενός ακεραίου είναι
 * πάντα θετικός αριθμός. Για παράδειγμα, το απόλυτο του -5
 * είναι 5, ενώ το απόλυτο του 5 είναι 5.
 */

public class AbsTernary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = 0;
        int abs = 0;

        System.out.println("Inser number: ");
        num1 = in.nextInt();

        abs = num1 >= 0 ? num1 : -num1;
        System.out.println("abs is " + abs);
    }
}
