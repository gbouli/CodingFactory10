package gr.aueb.cf.ch3;

/**
 * 2026_04_06_MODAY
 * Υπολογίζει το άθρισμα των αριθμών
 * από το 1 έως το 10, δηλαδή 1 + 2 + ... + 10
 */
public class Sum10 {
    public static void main(String[] args) {

        int i = 0;
        int j = 1;
        int sum = 0;
        int mul = 1;

        while (i <= 10) {
            sum += i; //sum = sum + 1
            i++;
        }


        while (j <= 10) {
            mul *= j; // mul = mul * j
            j++;

        }
        System.out.println("Sum = " + sum);
        System.out.println("Mul = " + mul);
    }
}
