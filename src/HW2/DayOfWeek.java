package HW2;

import java.util.Scanner;

public class DayOfWeek {
    public static int dayofweek(int m, int d, int y) {
        int yo = y - (14 - m) / 12;
        int x = yo + yo / 4 - yo / 100 + yo / 400;
        int mo = m + 12 * ((14 - m)/12) - 2;
        return (d + x + 31 * mo / 12) % 7;
    }

    public static void main(String[] args) {

        // prompt the user for day, month, and year,
        // and call the function with the inputted values

        // scanner allows for user input
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter the month in number form: ");
        int month = kbd.nextInt();

        System.out.print("Enter the day of month in number form: ");
        int day = kbd.nextInt();

        System.out.print("Enter the year: ");
        int year = kbd.nextInt();

        System.out.printf("%d" + "/" + "%d" + "/" + "%d" + " is the %d day of the week.", month, day, year, dayofweek(month, day, year));

    }
}
