package Exam1;

import java.util.Scanner;

public class Exam1 {

    public static int get_number(Scanner kbd) {
        boolean valid = false;
        int number = 0;

        while (true) {
            System.out.println("Enter a positive integer: ");
            if (kbd.hasNextInt()) {
                number = kbd.nextInt();
                if (number < 0) {
                    System.out.printf("Error: Number should be great than 0. You entered \"%d\" \n", number);
                } else {
                    break;
                }

            } else {
                System.out.printf("Error: Positive integer expected. You entered \"%s\" \n", kbd.next());
            }

        }
        return number;
    }

    public static int twoSeven(int n){
        int count = 0;
        while (n > 0){
            if (n % 10 == 3 || n % 10 == 4 || n % 10 == 5 || n % 10 == 6){
                count++; //increment value by 1
            }
            n = n / 10;
        }
        return count;
    }



    public static void main (String [] args){
        Scanner kbd = new Scanner(System.in);
        int number = get_number(kbd);
        System.out.printf("The number of digits between the numbers 2 and 7 in the number %d is %d", number, twoSeven(number));
    }

}


