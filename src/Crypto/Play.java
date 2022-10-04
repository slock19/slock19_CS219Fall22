package Crypto;

public class Play {

    public static void main(String [] args){
        System.out.println(3/2);
        System.out.println(-3/2);
        System.out.println(Math.floor(-1.25)); // -2
        System.out.println(Math.floor(-33.1)); // -34
        System.out.println(Math.floor(1.25)); // largest whole number less than or equal to the argument
        System.out.println(-5/2); // -2
        System.out.println(Math.floor(-5/2)); // -2, does division first then takes floor
        System.out.println(Math.floor(-5/2.0)); // -3
        System.out.println(Math.floorDiv(-3,2)); // does division and floor in one step so -2

        // remainder play
        System.out.println(-15 % 12);    // q = x/y : r = x - qy so r = -3
        System.out.println(-93 % 13);    // q = -93/13: r = -93 - -7(13) = -2
        System.out.println(Math.floorMod(-15,12)); // q = -15/12 = -2 : r = -15 - - 2(12) = 9
        System.out.println(Math.floorMod(-93, 13)); // q = -93/13 = -8 : r = -93 - -8(13) = 11
        System.out.println((int)'w');
        System.out.println((int)'i');
        System.out.println((int)'f');
        System.out.println((int)'x');
        System.out.println((char)99 % 26 );
        System.out.println((char)85 % 26);
        System.out.println((char) 82 % 26);
        System.out.println((char) 100 % 26);
    }

}
