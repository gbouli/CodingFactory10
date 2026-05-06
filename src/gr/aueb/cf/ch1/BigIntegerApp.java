package gr.aueb.cf.ch1;

import java.math.BigInteger;

public class BigIntegerApp {
    public static void main(String[] args) {

        BigInteger num1 = new BigInteger("2147483647");
        BigInteger num2 = new BigInteger("2147483647");
        BigInteger result = num1.add(num2);

        System.out.printf("%,d", result);
    }
}
