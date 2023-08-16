package org.launchcode.java.demos.lsn1datatypes.exercises;
import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of your rectangle");
        Double length = input.nextDouble();

        System.out.println("Enter the width of your rectangle");
        Double width = input.nextDouble();

        Double area = length * width;

        System.out.println("The area of your rectangle is " + area);




    }
}
