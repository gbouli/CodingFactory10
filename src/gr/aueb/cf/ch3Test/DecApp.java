package gr.aueb.cf.ch3Test;

public class DecApp {
    public static void main(String[] args) {
        char ch1 = 'a';
        char ch2 = '*';

        System.out.println("cha1 = " + ch1);
        System.out.println("cha1 = " + (int)ch1);

        System.out.println("cha2 = " + ch2);
        System.out.println("cha2 = " + (int)ch2);

        System.out.printf("%c = %d ordinal %n", ch1, (int)ch1);
        System.out.printf("%c = %d ordinal %n", ch2, (int)ch2);
    }

}
