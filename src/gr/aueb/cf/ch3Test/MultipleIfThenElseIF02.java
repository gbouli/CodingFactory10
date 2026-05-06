package gr.aueb.cf.ch3Test;

import java.util.Scanner;

public class MultipleIfThenElseIF02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            int modulesCount = 0;
            int totalMarks = 0;
            int average = 0;


            System.out.println("Insert number of Modules");
            modulesCount = input.nextInt();

            if (modulesCount == 0) {
            System.out.println("Modules cannot be 0");
            continue;
            }

            System.out.println("Insert sum of marks");
            totalMarks = input.nextInt();

            average = totalMarks / modulesCount;


            if (average >= 9) {
                System.out.println("Excellent " + average);
            } else if (average >= 7) {
                System.out.println("Very Good " + average);
            } else if (average >= 5) {
                System.out.println("Good " + average);
            } else {
                System.out.println("Sorry, you are a afilure!");
            }
            System.out.println("Do you want to continue? (yes/no)");
            String choice = input.next();

            if (choice.equalsIgnoreCase("no")) {
                break;
            }
        }
    }
}
