package gr.aueb.cf.ch5Test;

import java.util.Scanner;

public class RoundingDoubles {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double area = 0.0;
        double roundedArea = 0.0;
        double truncatedArea = 0.0;

        System.out.println("Please insert area with 6 decimals: ");
        area = in.nextDouble();

        roundedArea = Math.round(area * 100) / 100.0;
        truncatedArea = (int) (area * 100) / 100.0;

        System.out.printf("area is: %.6f, rounded area is: %.2f and truncated area is: %.2f%n", area, roundedArea, truncatedArea);

    }
}
