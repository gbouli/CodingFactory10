package gr.aueb.cf.ch5Test;

public class EvenOdd {

    public static void main(String[] args) {
        int myNumber = 10;

        // Εδώ η τιμή που επιστρέφει η isEven "προσγειώνεται" στη μεταβλητή check
        boolean check = isEven(myNumber);

        System.out.println("Ο αριθμός " + myNumber + " είναι ζυγός; " + check);

        // Εδώ η τιμή που επιστρέφει η isOdd μπαίνει απευθείας στην println
        System.out.println("Είναι ο 7 μονός; " + isOdd(7));
    } // Τέλος της main

    public static boolean isEven(int num) {
        // Υπολογίζει το true/false και το "πετάει" πίσω στη main
        return num % 2 == 0;
    }

    public static boolean isOdd(int num) {
        // Καλεί την isEven, παίρνει το αποτέλεσμα, το αντιστρέφει και το "πετάει" στη main
        return !isEven(num);
    }

} // Τέλος της κλάσης EvenOdd (Πρέπει να είναι στο τέλος!)
