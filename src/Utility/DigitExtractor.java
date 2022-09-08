package Utility;

public class DigitExtractor {

    public static int last(int n){
        if (n < 0){
            n = -n;
        }
        return n % 10;
    }
    public static int SecondToLast(int n){
        if (n < 0){
            n = -n;
        }
        return (n / 10) % 10;
    }

    public static int ThirdToLast(int n){
        if (n < 0){
            n = -n;
        }
        return (n / 100) % 10;
    }

    public static void main(String[] args){
        System.out.println(last(2753) == 3);
        System.out.println(last(-749) == 9);
        System.out.println(SecondToLast(2753) == 5);
        System.out.println(SecondToLast(-749) == 4);
        System.out.println(ThirdToLast(2753) == 7);
        System.out.println(ThirdToLast(-749) == 7);
    }
}
