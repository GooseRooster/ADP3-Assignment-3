package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String[] subjects = {"ADP3", "ADT3", "ICE3", "ITS3", "PFP3", "PRM3", "PRP3", "PRT3"};
        int[] marks = {75, 75, 70, 65, 75, 60, 70, 65};
        Scanner sc = new Scanner(System.in);
        String input;
        ItStudent s = new ItStudent();
        ItStudentAlt sAlt = new ItStudentAlt();


        do {
            System.out.println("Please enter your choice of program. ItStudent(1) utilizes Inheritance whereas ItStudentAlt(2) utilizes Composition. Press 3 to exit. ");
            input = sc.nextLine();
            if (input.equals("1")) {
                System.out.println(s.markPlacement(marks, subjects));
            }
            else if (input.equals("2")) {
                System.out.println(sAlt.markPlacement(marks, subjects));
            }
            else if (input.equals("3")) {
                System.out.println("Goodbye.");
            }
            else
                System.out.println("Please enter valid input.");
        } while (!input.equals("3"));


    }
}
