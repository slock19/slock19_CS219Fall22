package HW5;

public class Exercise66 {

    public static boolean canSpell(String word, String tiles) {
        int count = 0;
        for (int i = 0; i < word.length(); i++){
            char word_char = word.charAt(i);
            for (int j = 0; j < tiles.length(); j++){
                char tiles_char = tiles.charAt(j);
                if (word_char == tiles_char) {
                    tiles = tiles.substring(0, j) + tiles.substring(j + 1);
                    count++;
                    break;
                }
            }
        }
        return count == word.length();
    }

    public static void main(String [] args) {
        System.out.println(canSpell("boot", "axobasrto"));
        System.out.println(!canSpell("hippo", "haxobapsrito"));
        System.out.println(canSpell("front", "fporehnt"));
        System.out.println(!canSpell("boot", "axrump"));
        System.out.println(canSpell("boot", "bboooott"));

        // Student: add more test cases
    }
}
