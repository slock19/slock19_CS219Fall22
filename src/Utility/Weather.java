package Utility;

import java.util.Scanner;

public class Weather {

    public static double windchill(double temp, double wind_vel){
        return 35.74 + (0.6215*temp) + ((0.4275 * temp) - 35.75) * Math.pow(wind_vel,0.16);
    }
    public static void main(String [] args){
        // used for getting input from the keyboard
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter temperature in degrees F: ");
        double temperature;

        if (kbd.hasNextDouble()){
            temperature = kbd.nextDouble();
        }
        else {
            System.out.printf("Error: please enter a decimal number. You entered \"%s\"", kbd.next());
            return;
        }

        System.out.print("Enter wind velocity in MPH: ");
        double wind_velocity;

        if (kbd.hasNextDouble()){
            wind_velocity = kbd.nextDouble();
        }
        else {
            System.out.printf("Error: please enter a decimal number. You entered \"%s\"", kbd.next());
            return;
        }

        System.out.printf("The windchill for %.1f at %.1f MPH is %.2f\n", temperature, wind_velocity, windchill(temperature, wind_velocity));
            // %.1f rounds to one decimal and gets data from unquoted section in order and \n starts a new line

        System.out.println("They said \"Don't do it\""); // use \" to add double quotes in a print string
    }
}
