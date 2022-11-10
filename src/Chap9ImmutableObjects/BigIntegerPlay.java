package Chap9ImmutableObjects;

import java.math.BigInteger;

public class BigIntegerPlay {

    public static int pow(int x, int y){
        int prod = 1;
        for (int i = 0; i < y; i++){
            prod = prod * x;
        }
        return prod;
    }

    public static int fact(int n){
        int prod = 1;
        for (int i = n; i > 0; i--){
            prod = prod * i;
        }
        return prod;
    }

    public static BigInteger bigfact(int n){
        BigInteger prod = new BigInteger("1");
        for (int i = n; i > 0; i--){
            prod = prod.multiply(BigInteger.valueOf(i));
        }
        return prod;
    }

    public static void main(String[] args) {
        System.out.println(fact(5)==120);
       // System.out.println(bigfact(2000000000));

        for (int i = 1; i < 30; i++){
            System.out.printf("%d : %d\n", i, fact(i));
        }

        for (int i = 1; i < 30; i++){
            System.out.printf("%d : %d\n", i, bigfact(i));
        }

        // need to use big integer because 32 bits is not enough

        BigInteger x = new BigInteger("43827092450714385743109272143098");
        System.out.println(x.multiply(x).pow(3)); // .multiply is an instance method

    }
}
