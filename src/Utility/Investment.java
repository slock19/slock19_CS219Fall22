package Utility;

import java.util.Scanner;

public class Investment {

    public static double investment(int c, double r, int t, double n){
        return c * Math.pow(1 + r/n, t*n);

    }
    public static void main(String [] args){

        Scanner kbd = new Scanner(System.in);
// initial investment
        System.out.print("Enter the initial investment amount: ");
        if (!kbd.hasNextInt()){
            System.out.printf("Error: Integer expected. You entered \"%s\"", kbd.next());
            return;
        }
        int amount = kbd.nextInt();
        if (amount <= 0){
            System.out.printf("Error: initial deposit should be great than 0. You entered \"%d\"", kbd.nextInt()) ;
        }

        // interest rate
        System.out.print("Enter the interest rate as a decimal: ");
        if (!kbd.hasNextDouble()){
            System.out.printf("Error: decimal expected for interest rate. You entered \"%s\"", kbd.next());
            return;
        }
        double interest = kbd.nextDouble();
        if (interest >= 0 && interest <= 1){
            System.out.printf("Error: interest rate should be expressed as a decimal between 0 and 1. " +
                    "For example 8 percent should be entered as .08. You entered\"%f\"", kbd.nextDouble()) ;
        }

        // time
        System.out.print("Enter the duration of your investment: ");
        if (!kbd.hasNextInt()){
            System.out.printf("Error: Integer expected. You entered \"%s\"", kbd.next());
            return;
        }
        int time = kbd.nextInt();
        if (time <= 0){
            System.out.printf("Error: time should be great than 0. You entered \"%d\"", kbd.nextInt()) ;
        }
        //compound
        System.out.print("Enter the amount of times the interest will compound yearly: ");
        if (!kbd.hasNextDouble()){
            System.out.printf("Error: number with decimal ending expected. You entered \"%s\"", kbd.next());
            return;
        }
        double compound = kbd.nextDouble();
        if (compound > 0){
            System.out.printf("Error: time should be expressed as a number with a decimal greater than 0. " +
                    "For example 8 percent should be entered as .08. You entered\"%f\"", kbd.nextDouble()) ;
        }
        System.out.println(investment(amount, interest, time, compound));

    }

}
