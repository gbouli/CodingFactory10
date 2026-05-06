package gr.aueb.cf.ch3;

import java.util.Scanner;
/**
 * 2026_04_07_TUESDAY
 * Μετράει το πλήθος των θετικών ακεράιων
 * που δίνει ο χρήστης και σταματάσει όταν ο χρήστης
 * δώσει έναν αρνητικό ακέραιο
 */

public class PositivesCountApp {
    public static void main(String[] args) {
        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int positiveCount = 0;

        //Όσο υάρχουν δεδομένα - do
        System.out.println("Παρακαλώ εισάγετε έναν ακέραιο (αρνητικός για έξοδο):");
        num = scanner.nextInt();

        while (num >= 0) {
            positiveCount++;
            System.out.println("Παρακαλώ εισάγετε έναν ακέραιο (αρνητικό για έξοδο):");
            num = scanner.nextInt();

        // Εκτύπωση αποτελεσμάτων
            System.out.println("Το πλήθος των θετικών είναι: " + positiveCount);
        }
    }
}
