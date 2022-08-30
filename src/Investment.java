public class Investment {

    public static double investment(double c, double r, int t, double n){
        return c * Math.pow(1 + r/n, t*n);

    }

    public static void main(String [] args){


        System.out.println(investment(1.0,1.0, 1, 1e9));
        System.out.println(investment(1000.0,0.03, 10, 365));
    }

}
