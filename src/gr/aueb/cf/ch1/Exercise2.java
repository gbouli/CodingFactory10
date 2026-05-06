package gr.aueb.cf.ch1;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Δηλώστε δύο αριθμούς: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        sum = num1 + num2;

        System.out.println("Οι αριθμοί είναι: " + num1 + " και " + num2);
        System.out.println("Το αποτέλεσμα της πρόσθεσης είναι ίσο με: " + sum);
    }
}
