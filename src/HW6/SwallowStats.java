package HW6;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class SwallowStats {

    public static void swallow_stats(){

        // connect to the webpage with data
        URL url = null;  // null is the nothing value
        Scanner s = null;
        String path = "http://10.60.15.25/~ehar/cs219/swallow-speeds.txt";

        try {
            url = new URL(path); // create an url object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // what is true by this point?
        // connect to desired website
        double sum = 0.0;
        int count = 0;
        double max = 0;
        double min = 100;
        // read each line of the web file
        while (true){
            if (!s.hasNextLine())
                break;
            String line = s.nextLine(); // will read a line from the website

            if (!line.contains("#") && line.length() > 0){ // modify condition to look at length of the line
                sum = sum + Double.parseDouble(line);
                count++;
                if (max < Double.parseDouble(line)) {
                    max = Double.parseDouble(line);

                }

                if (min > Double.parseDouble(line)) {
                    min = Double.parseDouble(line);

                }
            }

        }
        System.out.printf("Average swallow speed is %.2f \n", sum/count);
        System.out.printf("The maximum swallow speed is %.1f \n", max);
        System.out.printf("The minimum swallow speed is %.1f \n", min);
    }

    public static void main (String [] args){
       swallow_stats();
    }
}
