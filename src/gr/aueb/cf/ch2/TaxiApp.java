package gr.aueb.cf.ch2;

import java.util.Scanner;

public class TaxiApp {
    public static void main(String[] args) {

        int kilometers = 0;
        final int COST = 374;
        int costInEuros = 0;
        int costInCents = 0;


        Scanner input = new Scanner(System.in);
        System.out.println("Please Insert Number of Kilometers: ");
        kilometers = input.nextInt();

        costInEuros = (kilometers * COST) / 100;
        costInCents = (kilometers * COST) % 100;

        System.out.printf("%d Euros and %d Cents", costInEuros, costInCents);

    }
}
