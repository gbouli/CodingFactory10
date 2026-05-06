package gr.aueb.cf.ch2;

/**
 * Διαβάσει δύο ακεραίους από το stdin (keyboroard)
 * και υπολογίζει το άθροισμα και το εκτυπώνει
 */

import java.util.Scanner;
public class AddScannerApp {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών   πρώτο scanner είναι τύπος, 2ο είναι μεταβλητή
        Scanner scanner = new Scanner(System.in);  // πλήρες όνομα java.util.Scanner
        int num1 = 0;
        int num2 = 0;
        int sum =0;

        //Data input Διαβάσζει και εκχωρεί μεταβλητές (data binding)
        System.out.println("Παρακαλώ εισάγετε δύο ακεραίους: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        //Λογική εφαρμογής - Παραστάσεις

        sum = num1 + num2;

        //εκτύπωση αποτελεσμάτων

        System.out.printf("Το άθροισμα των %d και %d είναι %d\n", num1, num2, sum);
        }
}
