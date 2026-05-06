package gr.aueb.cf.ch5Test;

import static gr.aueb.cf.ch5.AddMethodApp.add;

public class FoolAround {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        int sum = 0;

        sum = add(a, b);

        System.out.println("Sum = " + sum);
    }

    public static int add(int a, int b) {
        return a + b;

    }

}
