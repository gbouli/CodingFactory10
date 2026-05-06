package gr.aueb.cf.ch2;
//2026_04_06_MONDAY_IN CLASS
/**
 * Λαμβάνει από τον χρήστη έναν ακέραιο που
 * αντιστιοχεί σε ώρες (hours). Μετατρέπει
 * σε λεπτά και δευτερόλεπτα.
 */
import java.util.Scanner;

public class HoursToMinSec {
    public static void main(String[] args) {

        //Δήλώση και Αρχικοποίηση
        Scanner scanner = new Scanner(System.in);
        final int HOURS_TO_MINUTES = 60;
        final int HOURS_TO_SECONDS = 3600;
        int inputHours = 0;
        int minutes = 0;
        int seconds = 0;

        // Input - Data Binding
        System.out.println("Παρακαλώ εισάγετε τον αριθμό των ωρών: ");
        inputHours = scanner.nextInt();

        //Εντολές Επεξεργασίας
        minutes = inputHours * HOURS_TO_MINUTES;
        seconds = inputHours * HOURS_TO_SECONDS;

        //Εκτύπωση Αποτελέσματος
        System.out.printf("Ώρες: %d, Λεπτά: %d, Δευτερόλεπτα: %d\n", inputHours, minutes, seconds);

    }
}
