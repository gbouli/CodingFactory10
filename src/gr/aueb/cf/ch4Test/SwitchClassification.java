package gr.aueb.cf.ch4Test;

import java.util.Scanner;

public class SwitchClassification {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int grade = 0;
        char classification = ' ';

        System.out.println("Please, enter your grade: ");
        grade = in.nextInt();

        classification = switch (grade) {
            case 1, 2, 3, 4 -> 'D';
            case 5, 6 -> 'C';
            case 7, 8 -> 'B';
            case 9, 10 -> 'A';
            default -> 'F';
        };
        System.out.println("Your grade is: " + classification);
    }
}
