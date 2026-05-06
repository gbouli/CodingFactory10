package gr.aueb.cf.ch1;

public class InitialsApp {

    public static void main(String[] args) {
        int n = 7; // Ύψος του γράμματος

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Όριζουμε τις συνθήκες για να σχηματιστεί το γράμμα 'A'
                if ((j == n / 2 - i || j == n / 2 + i) && i != 0 || (i == n / 2 && j > 0 && j < n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}