package gr.aueb.cf.ch5Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundingAndBigDecimal {
    public static void main(String[] args) {

        BigDecimal bigNum = new BigDecimal("10.123456");
        BigDecimal divisor = new BigDecimal("3");
        BigDecimal result = BigDecimal.ZERO;
        BigDecimal result2 = BigDecimal.ZERO;

        result = bigNum.divide(divisor, 2, RoundingMode.HALF_UP );
        result2 = bigNum.divide(divisor, 2, RoundingMode.HALF_EVEN);


        System.out.println("result is: " + result);
        System.out.println("result2 is: " + result2);
    }
}
