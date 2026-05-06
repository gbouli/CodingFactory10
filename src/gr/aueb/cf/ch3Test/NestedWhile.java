package gr.aueb.cf.ch3Test;

import java.util.Scanner;

public class NestedWhile {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int start = 0;
        int end = 0;
        int step = 0;
        int count = 0;
        int i = 1;
        final int TIMES = 3;

        while (i <= TIMES) {
            count = 0;
            System.out.println("Insert start, end and step");
            start = in.nextInt();
            end = in.nextInt();
            step = in.nextInt();

            while (start <= end) {
                count++;
                start += step;
            }
            System.out.println("number of count: " + count);
            i++;
        }
    }
}
