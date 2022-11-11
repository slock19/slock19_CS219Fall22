package Exam2;

import ArrayExamples.Examples;
import RecursionExamples.Recursion;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Exam2Redo {

    public static String [] reverse_string(String [] arr){
        for (int i = 0; i < arr.length/2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }
    public static void print_array_string(String [] arr) {
        System.out.print('[');
        for (int i = 0; i < arr.length - 1; i++)
            System.out.print(arr[i] + ", ");
        System.out.print(arr[arr.length - 1]);
        System.out.println(']');
    }
    public static String [] load_words(String path, int n){
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
        String [] words = new String [9];

        int i = 0;
        while (s.hasNextLine()){
            String current = s.nextLine();
            if(Recursion.isPalindrome2(current)){
                words[i++] = current;
            }
        }
        return words;
        }

    public static void main(String[] args) {
        String[] words = load_words("http://10.60.15.25/~ehar/cs219/wordle-nyt-solutions.txt", 2309);
        print_array_string(reverse_string(words));
    }
}
