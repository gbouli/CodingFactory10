package gr.aueb.cf.ch3Test;

public class PdfExcercise {
    public static void main(String[] args) {

        char a = 'α';
        char b = 'a';

        System.out.println(" a " + (int) a);
        System.out.println(" a " + a);

        System.out.println(" b " + (int) b);
        System.out.println(" b " + b);

        System.out.printf("%c = %d ordinal%n", a, (int) a);
        System.out.printf("%c = %d ordinal", b, (int) b);

    }
}