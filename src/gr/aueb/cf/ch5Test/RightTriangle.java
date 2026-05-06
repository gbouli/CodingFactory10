package gr.aueb.cf.ch5Test;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

     double a = 0;
     double b = 0;
     double c = 0;
     boolean isRightTriangle = false;
     final double EPSILON = 0.0000001;

        System.out.println("insert sides starting at crosscut: ");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        isRightTriangle = Math.abs(a * a - b * b - c * c) < EPSILON;
        System.out.println("the triangle is right : " + isRightTriangle);


    }
}
