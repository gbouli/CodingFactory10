package gr.aueb.cf.ch2;

import java.util.Scanner;

public class AgeInDaysTest {

    public static void main(String[] args) {

    int InputAgeInYears = 0;
    int AgeInDays = 0;
    final int DAYS_IN_YEAR = 365;

    Scanner input = new Scanner(System.in);
    System.out.println("Your Age in Years is: ");
    InputAgeInYears = input.nextInt();
        System.out.println("Your Age in Years is: " + InputAgeInYears);


    AgeInDays = InputAgeInYears * DAYS_IN_YEAR;
    System.out.println("Your Age in Days is: " + AgeInDays);

    }
}
