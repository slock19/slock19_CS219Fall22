package Chap9ImmutableObjects;

public class Main {

    public static void main(String[] args) {
        String s = "hello";
        String t = new String("hello"); // long version

        // version of s that is capitalized
        String s1 = Character.toUpperCase(s.charAt(0)) + s.substring(1);
        // strings are immutable

        // StringBuilder - mutable strings

        // Character objects are also immutable

        char ch = 'a'; // primitive 01100001
        Character ch2 = 'a'; // reference to object

        // primitive type has a direct representation of binary 0,1

        int x = 33; //primitive 0100001
        Integer y = 33;

        Double pi = 3.14159;
        Boolean flag = false;
        Long ll = 43L;
        // all are immutable and called wrapper classes for their respective primitive types
        // taking a primitive value and wrapping it in an object is autoboxing
        // opposite is called autounboxing

        Student student1 = new Student("Hermione", "Granger", "14001000", "The Smart One");
        // student1.first = "harry"; error
        //student1.nickname = ""; // can edit because nickname is not private
        System.out.println(student1); // toString is implicitly called
        Student student2 = new Student("Scott", "Locker", "14004295", "Scooter");
        System.out.println(student2);
    }


}
