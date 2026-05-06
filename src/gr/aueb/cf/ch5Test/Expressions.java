package gr.aueb.cf.ch5Test;

public class Expressions {
    public static void main(String[] args) {

        int myInt = 10;
        float myFloat = 10.5f;
        double myDouble = 10.5;
        double result = 0.0;
        final double PI = 3.1415926535897932384626433832795;
        final double LIGHT_SPEED = 299792458.0;

        result = myInt + myFloat + myDouble;
        System.out.println("the result is " + result);
        System.out.printf("result formatted is %.6f", result);
        System.out.println();
        System.out.printf("PI is: %.10f %nSpeed is %.2f%n", PI, LIGHT_SPEED);
    }

}
