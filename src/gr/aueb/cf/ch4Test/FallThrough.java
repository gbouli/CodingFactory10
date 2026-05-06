package gr.aueb.cf.ch4Test;

import java.util.Scanner;

public class FallThrough {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int grade = 0;

        for (; ;) {
            System.out.println("Please, insert grade: ");
            grade = in.nextInt();

            switch (grade) {
                case 1, 2, 3, 4 -> System.out.println("You are a Loser!!!!");
                case 5, 6 -> System.out.println("you are ok!");
                case 7, 8 -> System.out.println("Not bad!");
                case 9, 10 -> System.out.println("Awsom0!");
                default -> System.out.println("wtf?");
            }
        }
    }
}