package org.launchcode.java.demos.lsn2controlflowandcollections.exercises;
import java.util.Arrays;

public class arrayPractice {
    public static void main(String[] args) {

        int[] integerArray = {1, 1, 2, 3, 5, 8};

        // loop through and print each value
        for (int i : integerArray) {
            System.out.println(i);
        }

        // loop through and print only odd values
        for (int i : integerArray) {
          if(!(i % 2 == 0)) {
              System.out.println(i);
          }
        }

        // Given a string, use the split method on each space and store the individual
        // words in an array

        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split(" ");
        System.out.println(Arrays.toString(words));

    }
}
