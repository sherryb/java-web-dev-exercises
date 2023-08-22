package org.launchcode.java.demos.lsn2controlflowandcollections.exercises;
import java.util.ArrayList;
import java.util.Arrays;

public class arrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        System.out.println(sumEven(numbers));

        String phrase = "Menma Menma Bean Menma Menma Menma Bean";
        printIntLetterWords(phrase, 5);

    }

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static void printIntLetterWords(String phrase, Integer number) {
        String[] words = phrase.split(" ");
        for(String word : words) {
            if(word.length() == number) {
                System.out.println(word);
            }
        }
    }

}
