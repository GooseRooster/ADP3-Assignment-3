package org.example;

public class ItStudent extends StudentRecord implements StudentData {


    @Override
    public double calculateAverage(int[] mark) {
        double total = 0;
        for (int i = 0; i < mark.length; i++) {
            total += mark[i];
        }
        return total/8;
    }

    @Override
    public String markPlacement(int[] mark, String[] subject) {
        String markList = "";
        for (int i = 0; i < mark.length; i++) {
            markList += subject[i] + ": " + mark[i] + "\n";
        }
        if (calculateAverage(mark) >= 50) {
            return "Student: " + getName() + " with student number " + getStudentNum() + " has passed, with the following marks: " + "\n" + markList;
        }
        else
            return "Student: " + getName() + " with student number " + getStudentNum() + " has failed, with the following marks : " + "\n" + markList;
    }
}
