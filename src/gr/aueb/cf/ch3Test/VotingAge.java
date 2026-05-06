package gr.aueb.cf.ch3Test;

import java.util.Scanner;

public class VotingAge {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int age = 0;
        boolean isEligible = false;

        System.out.println("Insert Age: ");
        age = in.nextInt();
        isEligible = age >= 18;

        System.out.println("Eligible: " + isEligible);

    }
}