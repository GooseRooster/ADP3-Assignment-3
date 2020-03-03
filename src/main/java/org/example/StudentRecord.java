package org.example;

public class StudentRecord {
    private int studentNum = 218006098;
    private String name = "Cameron";

    public StudentRecord(int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }

    public StudentRecord() {

    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
