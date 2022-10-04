package Utility;

import java.util.Scanner;

public class Weather {

    public static double windchill(double temp, double wind_vel) {
        return 35.74 + (0.6215 * temp) + ((0.4275 * temp) - 35.75) * Math.pow(wind_vel, 0.16);
    }
    public static double get_velocity(Scanner kbd){
        boolean valid = false;
        double wind_velocity = 0;

        while (true) {
            System.out.print("Enter wind velocity in MPH: ");
            if (kbd.hasNextDouble()) {
                wind_velocity = kbd.nextDouble();
                if (wind_velocity < 0){
                    System.out.printf("Error: velocity cannot be negative. You entered %.2f\n", wind_velocity);
                }
                else {
                    break;
                }
            } else {
                System.out.printf("Error: please enter a decimal number. You entered \"%s\" \n", kbd.next());
            }
        }
        return wind_velocity;
    }

    public static double get_temperature(Scanner kbd){
        double temperature;
        boolean check = true;
        while(true) {
            System.out.print("Enter temperature in degrees F: ");
            if (kbd.hasNextDouble()) {
                temperature = kbd.nextDouble();
                break;
            } else {
                System.out.printf("Error: please enter a decimal number. You entered \"%s\"\n", kbd.next());
            }
        }
        return temperature;
    }

    public static void main(String[] args) {
        // used for getting input from the keyboard
        Scanner kbd = new Scanner(System.in);

        double temperature = get_temperature(kbd);
        double wind_velocity = get_velocity(kbd);

        System.out.printf("The windchill for %.1f at %.1f MPH is %.2f\n", temperature, wind_velocity, windchill(temperature, wind_velocity));
        // %.1f rounds to one decimal and gets data from unquoted section in order and \n starts a new line

    }
}
