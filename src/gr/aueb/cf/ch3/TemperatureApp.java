package gr.aueb.cf.ch3;

import java.util.Scanner;
/**
 * 2026_04_06_MONDAY
 * Ο χρήστης εισάγει έναν ακέραιο που συμβολίζει
 * θερμοκρασία και το πρόγραμμα υπολογίζει άν
 * η θερμοκρασία είναι μικρότερη του μηδέν < 0 μία μεταβλητή ,
 * έστω isTempBelowZero γίνεται true, αλλιώς false,
 * Τέλος εκτυπώνει το αποτέλεσμα.
 */
public class TemperatureApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputTemp = 0;
        boolean isTemperarureBelowZero = false;

        System.out.println("Παρακαλώ εισάγετε την θερμοκρασία: ");
        inputTemp = scanner.nextInt();

        isTemperarureBelowZero = inputTemp < 0;

        System.out.println("Η θερμοκρασία είναι κάτω από το μηδέν: " + isTemperarureBelowZero);
    }
}
