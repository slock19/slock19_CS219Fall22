public class Weather {

    public static double windchill(double temp, double wind_vel){
        return 35.74 + (0.6215*temp) + ((0.4275 * temp) - 35.75) * Math.pow(wind_vel,0.16);

    }

    public static void main(String [] args){


        System.out.println(windchill(32.0, 10));
    }



}
