package org.launchcode.java.demos.lsn1datatypes.exercises;
import java.util.Scanner;
public class Alice {
    public static void main(String[] args) {
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word to look for in the sentence ");
        String userWord = input.nextLine();

        Integer index = sentence.indexOf(userWord);
        Integer length = userWord.length();

        System.out.println("Your search term appears at index " + index + ". Length: " + length);
        String modifiedSentence = sentence.replace(userWord, "");
        System.out.println(modifiedSentence);


    }
}
