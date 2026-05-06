package gr.aueb.cf.ch3;

import java.util.Scanner;
/**
 * Ο χρήστης εισάγει ακεραίους προσπαθώντας να
 * μαντέψει έναν μυστικό ακέραιο.
 */
public class SecretApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int SECRET = 12; // μυστικός ακέραιος
        int guess = 0;

        System.out.println("Προσπαθήστε να μαντέψετε τον μυστικό ακέραιο.");
        guess = in.nextInt();

        if (guess == SECRET) {
            System.out.println("Συγχαρητήρια, μαντέψατε σωστά!");
        } else {
            System.out.println("Λυπάμαι, η εικασία σας είναι λάθος");
        }
    }
}
