package gr.aueb.cf.ch3Test;

import java.util.Scanner;

public class StarsFlexApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 1;
        int n = 0;

        System.out.println("Insert Number:");
        n = in.nextInt();

        while (i<=n) {
            System.out.println("*");
            i++;
        }
    }
}
