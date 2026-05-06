package gr.aueb.cf.ch3Test;

public class SumMulApp {
    public static void main(String[] args) {

        int sum = 0;
        int mul = 1;

        for (int i = 1; i <= 10; i++) {
            sum += i;
            mul *= i;
        }

        System.out.printf("sum is %d%n", sum);
        System.out.printf("mul is %d", mul);

    }
}
