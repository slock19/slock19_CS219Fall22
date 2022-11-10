package Chap9ImmutableObjects;

import java.math.BigInteger;

public class DiffieHellman {
    public static void main(String[] args) {
        // get a big prime number
        BigInteger p = new BigInteger("7919");

        // get a priv_a key
        BigInteger Apriv = new BigInteger("123456789");

        // alice computers her public key
        BigInteger Apub = BigInteger.TWO.modPow(Apriv, p);

        // send to bob

        // bob picks a priv key

        BigInteger Bpriv = new BigInteger("497");

        // bob computes public key

        BigInteger Bpub = BigInteger.TWO.modPow(Bpriv, p);

        //sends to alice

        //alice can compute shared key

        BigInteger Ashared = Bpub.modPow(Apriv, p);
        BigInteger Bshared = Apub.modPow(Bpriv, p);

        System.out.println(Ashared);
        System.out.println(Bshared);
    }
}
