public class Time {
    public static void main(String [] args) {
        int hour = 16;
        int minute = 39;
        int second = 45;


        // Displaying the current time
        System.out.print("The current time is ");
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minute);
        System.out.print(".");
        System.out.println(second);

        // calculating the seconds past midnight
        int seconds_past_midnight = (hour * 60 * 60) + (minute * 60) + second;
        System.out.print(seconds_past_midnight);
        System.out.println(" seconds have past since midnight.");

        // calculating the seconds remaining in the day.
        // ran into an issue in the next question using ints, so I switched these to doubles
        double seconds_in_a_day = 24 * 60 * 60;
        double seconds_left = seconds_in_a_day - seconds_past_midnight;
        System.out.print("There are ");
        System.out.print(seconds_left);
        System.out.println(" seconds left in the day today.");

        // calculating the percent of the day left.
        double percent_left = ( seconds_left / seconds_in_a_day) * 100;
        System.out.print(percent_left);
        System.out.println(" percent of the day remains.");

        // Calculating the time spent on this
        int current_hour = 17;
        int current_minute = 5;
        int current_second = 15;

        double seconds_past_midnight_2 = (current_hour * 60 * 60) + (current_minute * 60) + current_second;
        double time_elapsed = (seconds_past_midnight_2 - seconds_past_midnight) / 60;


        System.out.print(time_elapsed);
        System.out.println(" minutes have passed since I started working on this.");

        // In the future I was thinking you would be able to use mod division to calculate hours and minutes




    }



}
