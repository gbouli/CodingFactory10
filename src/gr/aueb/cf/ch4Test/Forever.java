package gr.aueb.cf.ch4Test;

public class Forever {
    public static void main(String[] args) {

    int count = 0;
    final int MAX = 100;

    for (;;) {
        System.out.print("Forever");
        count++;

        if (count %10 == 0) {
            System.out.println();
        }
        if (count == MAX) {
            break;
        }
    }
    }
}
