package Exam2;
import ArrayExamples.Examples;
import Wordle.Game;
import RecursionExamples.Recursion;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Exam {
    public static void load_words(String path, int n){
        // connect to the webpage with data
        URL url = null;  // null is the nothing value
        Scanner s = null;

        try {
            url = new URL(path); // create an url object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // create an array of strings
        String [] words = new String [n];

        int i = 0;
        while (s.hasNextLine()){
            words[i++] = s.nextLine();
        }

        String [] palindrome = new String [0];
        for (int j = 0; j < words.length; j++){
            if (Recursion.isPalindrome2(words[j]))
                return palindrome [] = palindrome + words[j];  //why wont this let me make an array
        }
        System.out.println(Examples.reverse(palindrome);); //wont work but this is my closest guess to getting it right.
        }



    public static void main(String[] args) {
        System.out.println(load_words("http://10.60.15.25/~ehar/cs219/wordle-nyt-solutions.txt", 2398));
    }

}

