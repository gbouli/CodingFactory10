package gr.aueb.cf.ch3Test;

import java.util.Scanner;

public class SnowingApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = 0;
        boolean isRaining = false;
        boolean isSnowing = false;

        System.out.println("Insert Temp: ");
        temp = in.nextInt();

        System.out.println("Is it Raining?; (true/false)");
        isRaining = in.nextBoolean();

        isSnowing = isRaining && (temp < 0);

        System.out.println("It is Snowing: " + isSnowing);
    }
}
