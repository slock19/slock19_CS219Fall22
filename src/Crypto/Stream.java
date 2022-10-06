package Crypto;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class Stream {
    public static String E(String clear, int key, boolean encrypt) {
        String cipher = "";
        final int alpha_length = 95;   // this should never change  // 126 - 32 + 1
        final char base_char = ' '; // space is the first character in the english keyboard

        SecureRandom rng = null;
        try {
            rng = SecureRandom.getInstance("SHA1PRNG");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        rng.setSeed(key); // seeding the random number generator


        for (int i = 0; i < clear.length(); i++){
            char clear_char = clear.charAt(i);
            int clear_char_pos = clear_char - base_char;
            int shift = rng.nextInt(100);
            if (!encrypt) {
                shift = -shift;
            }
            int cipher_char_pos = Math.floorMod(clear_char_pos + shift, alpha_length);
            char cipher_car = (char)(cipher_char_pos + base_char);
            cipher = cipher + cipher_car;
        }
        return cipher;
    }




    public static void main(String [] args) {
        System.out.println(E("java", 10, true));
        System.out.println(E("j\\?v", 10, false)); // need to use double backslash to get java to read one in the quotes
    }

}
