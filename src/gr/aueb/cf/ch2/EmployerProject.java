package gr.aueb.cf.ch2;

import java.util.Scanner;

public class EmployerProject {
    public static void main(String[] args) {

        int numOfTotalHours = 0;
        int numOfWorkers = 0;
        int numOfHoursPerWorker = 0;
        int numOfHoursRemaining = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Input Number of Total Hours: ");
        numOfTotalHours = input.nextInt();
        System.out.print("Input Number of Workers: ");
        numOfWorkers = input.nextInt();
        Scanner close;

        numOfHoursPerWorker = numOfTotalHours / numOfWorkers;
        numOfHoursRemaining = numOfTotalHours % numOfWorkers;

        System.out.printf("Hours Each Worker Works for: %d\nHours Reamining: %d", numOfHoursPerWorker, numOfHoursRemaining);
    }
}
