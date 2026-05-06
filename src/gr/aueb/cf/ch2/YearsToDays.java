package gr.aueb.cf.ch2;

/**
 * Ο χρήστης εισάγει την ηλικία του σε έτη (έστω ακέραιος)
 * και το πρόγραμμα επιστρέφει την ηλικία σε ημέρες, όπου
 * θεωρούμε ότι 1 έτος - 365 μέρες. Για παράδειγμα, αν δοθεί
 * ηλικία 20 ετών, το αποτέλεσμα θα είναι 7300 ημέρες.
 */

import java.util.Scanner;
public class YearsToDays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputAgeInYears = 0;
        int ageInDays = 0;
        final int DATS_IN_YEAR = 365;

        //Input & Data Binding
        System.out.println("Παρακαλώ εισάγετε την ηληκία σας σε έτη: ");
        inputAgeInYears = scanner.nextInt();

        //Λογική της Εφαρμογής
        ageInDays = inputAgeInYears * DATS_IN_YEAR;

        //Εκτύπωση αποτελεσμάτων
        System.out.printf("Ηλικία σε έτη: %d, Ηλικία σε ημέρες: %d\n", inputAgeInYears, ageInDays);

        }
}
