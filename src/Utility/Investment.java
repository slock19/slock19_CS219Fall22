package Utility;

import java.util.Scanner;

public class Investment {

    public static double investment(int c, double r, int t, double n){
        return c * Math.pow(1 + r/n, t*n);

    }

    public static int get_amount(Scanner kbd) {
        boolean valid = false;
        int amount = 0;

        while (true) {
            System.out.println("Enter the initial investment amount: ");
            if (kbd.hasNextInt()) {
                amount = kbd.nextInt();
                if (amount < 0) {
                    System.out.printf("Error: initial deposit should be great than 0. You entered \"%d\" \n", amount);
                } else {
                    break;
                }

            } else {
                System.out.printf("Error: Integer expected. You entered \"%s\" \n", kbd.next());
            }

        }
        return amount;
    }

    public static double get_interest(Scanner kbd) {
        boolean valid = false;
        double interest = 0;

        while (true) {
            System.out.println("Enter the interest rate: ");
            if (kbd.hasNextDouble()) {
                interest = kbd.nextDouble();
                if (interest < -1 || interest > 1) {
                    System.out.printf("Error: Interest should be a decimal between -1 and 1. You entered \"%s\" \n", interest);
                } else {
                    break;
                }

            } else {
                System.out.printf("Error: Decimal number expected. You entered \"%s\" \n", kbd.next());
            }

        }
        return interest;
    }

    public static int get_time(Scanner kbd) {
        boolean valid = false;
        int time = 0;

        while (true) {
            System.out.println("Enter the investment duration: ");
            if (kbd.hasNextInt()) {
                time = kbd.nextInt();
                if (time < 0) {
                    System.out.printf("Error: Duration should be great than 0. You entered \"%d\" \n", time);
                } else {
                    break;
                }

            } else {
                System.out.printf("Error: Decimal number expected. You entered \"%s\" \n", kbd.next());
            }

        }
        return time;
    }

    public static int get_compound(Scanner kbd) {
        boolean valid = false;
        int compound = 0;

        while (true) {
            System.out.println("Enter the annual compound amount: ");
            if (kbd.hasNextInt()) {
                compound = kbd.nextInt();
                if (compound < 0) {
                    System.out.printf("Error: annual compound amount should be great than 0. You entered \"%d\" \n ", compound);
                } else {
                    break;
                }

            } else {
                System.out.printf("Error: Integer expected. You entered \"%s\" \n", kbd.next());
            }

        }
        return compound;
    }




    public static void main(String [] args){

        Scanner kbd = new Scanner(System.in);
        int amount = get_amount(kbd);
        double interest = get_interest(kbd);
        int time = get_time(kbd);
        double compound = get_compound(kbd);

        System.out.println(investment(amount, interest, time, compound));

    }

}
