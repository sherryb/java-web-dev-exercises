package org.launchcode.java.demos.lsn2controlflowandcollections.exercises;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class hashmapPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // The provided solution won't build :|

        do {
            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer newID = input.nextInt();
                classRoster.put(newID, newStudent);

                input.nextLine();
            }
        } while(!newStudent.equals(""));

        input.close();

        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : classRoster.entrySet()) {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }

        System.out.println("Number of students in roster: " + classRoster.size());
    }

}
