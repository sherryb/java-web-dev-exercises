package org.launchcode.java.demos.lsn2controlflowandcollections.studio;
import java.util.HashMap;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class CountCharactersInString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string to count the characters: ");
        String userInput = input.nextLine();
        String lowerCaseInput = userInput.toLowerCase();
        char[] charifiedInput = lowerCaseInput.toCharArray();
        String specialCharacters = "!@#$%^&*()-_+={}[];:<>,./?";
        HashMap<Character, Integer> characterCounts = new HashMap<Character, Integer>();
        input.close();

        for(Character character : charifiedInput) {
            if(!specialCharacters.contains(character.toString())) {
                if(characterCounts.containsKey(character)) {
                    characterCounts.put(character, characterCounts.get(character) + 1);
                } else {
                    characterCounts.put(character, 1);
                }
            }
        }
        System.out.println(characterCounts);
    }
}
