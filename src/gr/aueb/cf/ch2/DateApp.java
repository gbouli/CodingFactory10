package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DateApp {
    public static void main(String[] args) {

        int day = 0;
        int month = 0;
        int year = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Import Day: ");
        day = input.nextInt();
        System.out.println("Import Month: ");
        month = input.nextInt();
        System.out.println("Import Year: ");
        year = input.nextInt();

        System.out.printf("%d/%d/%d", day, month, year);
    }
}
