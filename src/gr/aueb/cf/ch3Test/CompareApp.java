package gr.aueb.cf.ch3Test;

public class CompareApp {
    public static void main(String[] args) {

        char a = 'α';
        char b = 'a';
        char c = 'Α';
        char d = 'A';
        boolean greekIsGreater = false;

        System.out.println((int) a);
        System.out.println((int) b);
        System.out.println((int) c);
        System.out.println((int) d);

        if (a > b) greekIsGreater = true; {
            System.out.println("Greek is Greater is " + greekIsGreater);
        }
    }
}
