package gr.aueb.cf.ch2;

import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {

        int Fahrenheit = 0;
        int Celsius = 0 ;

        Scanner input = new Scanner(System.in);
        System.out.println("Please insert Fahrenheit Temperature: ");
        Fahrenheit = input.nextInt();
        Celsius = 5 * (Fahrenheit - 32) / 9;

        System.out.printf("Fahrenheit: %d, Celsius: %d", Fahrenheit, Celsius);

    }
}
