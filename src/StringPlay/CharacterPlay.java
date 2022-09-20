package StringPlay;

public class CharacterPlay {

    public static int countVowels(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'A'|| ch == 'e' || ch == 'E'|| ch == 'i'
                    || ch == 'I'|| ch == 'o'|| ch == 'O' || ch == 'u' || ch == 'U' )
            count++;
        }
        return count;
    }

    public static void main (String [] args){
        char ch = 'a'; // 'a' is just shorthand for an integer code assigned by the Unicode Consortium
        System.out.println(countVowels("applesauce") == 5);
        System.out.println(ch);
        System.out.println((int) ch); // 97 was what was agreed on for integer value of 'a'
        System.out.println((char)('a' + 1));
        System.out.println((char) 8749);
        System.out.println((char) 92021);
        System.out.println((char) 849);
        System.out.println((char) 10749);



    }

}
