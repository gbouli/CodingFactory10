package gr.aueb.cf.ch3Test;

import java.util.Scanner;


public class TempApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int temp = 0;
        boolean isTempBelowZero = false;

        System.out.println("Insert Temp: ");
        temp = in.nextInt();
        isTempBelowZero = temp < 0;

        System.out.println("Temp is below zero: " + isTempBelowZero);

    }
}
