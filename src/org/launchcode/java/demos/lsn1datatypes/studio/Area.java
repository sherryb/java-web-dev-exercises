package org.launchcode.java.demos.lsn1datatypes.studio;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius: ");
        Double radius = input.nextDouble();

        Double area = Circle.getArea(radius);
        System.out.println("Area of " + area + " with radius of " + radius);

    }
}
