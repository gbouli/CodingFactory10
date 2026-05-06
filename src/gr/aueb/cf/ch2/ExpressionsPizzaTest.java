package gr.aueb.cf.ch2;

import java.util.Scanner;

public class ExpressionsPizzaTest {

    public static void main(String[] args) {

        //int numFriends = 0;
        //int numPizzas = 0;
        int numSlices = 8;

        int totalSlices = 0;
        int slicesPerPerson = 0;
        int leftOverSlices = 0;

        //int pizzaCost = 0;
        //int drinkCost = 0;
        int totalBill = 0;
        int costPerPerson = 0;
        int totalBillWithDiscount = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Friends: ");
        int numFriends = input.nextInt();

        System.out.print("Enter the number of Pizzas: ");
        int numPizzas = input.nextInt();

        System.out.print("Enter the Price of one Pizza: ");
        int pizzaCost = input.nextInt();

        System.out.print("Enter the number of Drinks: ");
        int numDrink = input.nextInt();

        System.out.print("Enter the Price of one Drink: ");
        int priceDrink = input.nextInt();

        System.out.println("ENter Discount: ");
        int discount = input.nextInt();

        System.out.println("Numver of Friends: " + numFriends);
        System.out.println("Number of Pizzas: " + numPizzas);
        System.out.println("Price of One Pizza: " + pizzaCost);
        System.out.println("Number of Drinks: " + numDrink);
        System.out.println("Price of One Drink: " + priceDrink);
        System.out.println("The Discount is: " + discount);


        totalSlices = numPizzas * numSlices;
        System.out.println("Total Number of Slices: " + totalSlices);
        slicesPerPerson = totalSlices / numFriends;
        System.out.println("Number of Slices per Person: " + slicesPerPerson);
        leftOverSlices = totalSlices % numFriends;
        System.out.println("Leftover Slices: " + leftOverSlices);
        totalBill = ((numPizzas * pizzaCost) + (numDrink * priceDrink));
        System.out.println("The Total Bill is: " + totalBill);
        totalBillWithDiscount = totalBill - (totalBill * discount / 100);
        System.out.println("The Total Bill With Discount is: " + totalBillWithDiscount);
        costPerPerson = totalBillWithDiscount / numFriends;
        System.out.println("The Cost per Person is: " + costPerPerson);


}

}
