import Utility.Investment; // Using the investment file from Utility

import java.util.Scanner;

public class InvestmentCalculator {

    public static void main(String [] args) {

        // prompt the user for c, r, t, n
        // and call the function with the inputted values

        // scanner allows for user input
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter the initial investment amount: ");
        int amount = kbd.nextInt();

        System.out.print("Enter the interest rate as a decimal: ");
        double interest = kbd.nextDouble();

        System.out.print("Enter the duration of your investment: ");
        int time = kbd.nextInt();

        System.out.print("Enter the amount of times the interest will compound  yearly: ");
        double compound = kbd.nextDouble();
// calling investment function from investment file
        System.out.printf("Your investment is worth %.2f", Investment.investment(amount, interest, time, compound));

    }

}
