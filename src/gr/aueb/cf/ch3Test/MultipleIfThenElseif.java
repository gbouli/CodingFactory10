package gr.aueb.cf.ch3Test;

import java.util.Scanner;
public class MultipleIfThenElseif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice = 0;

        do {
            System.out.println("Insert Choice 1-4 or 5 to exit:");
            System.out.println("1. Enter");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. Update");
            System.out.println("5. Exit");
            choice = input.nextInt();

            if (choice == 1) {
                System.out.println("Enter Success!");
            } else if (choice == 2) {
                System.out.println("Search Success!");
            } else if (choice == 3) {
                System.out.println("Delete Success!");
            } else if (choice == 4) {
                System.out.println("Update Success!");
            } else {
                System.out.println("Wrong Choice");
            }
        } while (choice != 5);
        System.out.println("Goodbye!");
    }
    }