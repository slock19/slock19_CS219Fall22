package Binary;

public class Binary {

    public static void printBinary(int n){
        if (n == 0)
            System.out.print(0);
        else{
            printBinary(n/2);
            System.out.print(n % 2);
        }
    }

    public static String toBinary(int n){
        String r = "";

        while (n > 0){
            r = (n % 2) + r;
            n = n / 2;
        }
        return r;
    }

    public static int parseInt(String bits){
        int curr_power = 1;
        int r = 0;
        for (int i = bits.length() - 1; i >= 0; i--){
            if (bits.charAt(i) == '1'){
                r = r + curr_power;
                curr_power = curr_power * 2;
            }
            else
                curr_power = curr_power * 2;
        }
        return r;
    }

    public static void main(String[] args) {
        printBinary(43); // 101011
        printBinary(77); // 1001101
        System.out.println();
        System.out.println(toBinary(43));
        System.out.println(toBinary(77));
        System.out.println(parseInt("101011") == 43);
        System.out.println(parseInt("1001101") == 77);
        System.out.println(Integer.parseInt("101011", 2));
        System.out.println(Integer.toBinaryString(4142000));
        System.out.println(Integer.toHexString(4142000));
    }
}
