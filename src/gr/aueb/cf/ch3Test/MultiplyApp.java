package gr.aueb.cf.ch3Test;

//import java.util.Scanner;

public class MultiplyApp {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);

        int mul = 1;
        int i = 1;
        //int n = 0;

        //System.out.println("Insert Number: ");
        //n = in.nextInt();

        while (i <= 10) {
            mul *= i;
            i++;
        }
        System.out.println("The sum is: " + mul);
    }
}
