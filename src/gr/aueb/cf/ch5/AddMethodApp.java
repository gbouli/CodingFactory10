package gr.aueb.cf.ch5Test;

import org.w3c.dom.ls.LSOutput;

public class AddMethodApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = 0;

        sum = add(a, b);

        System.out.printf("Το άθροισμα %d και %d είναι %d: ", a, b, sum);
        System.out.println(a + b);
    }

        public static int add(int a, int b) {
            return a + b;

  }
}