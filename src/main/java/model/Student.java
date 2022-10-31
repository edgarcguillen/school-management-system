package model;

import java.math.BigDecimal;

/**
 * This class is responsible for keeping
 * track of students
 */
public class Student {

    private int id;
    private String studentName;
    private String degreeOfStudy;
    private double gpa;
    private BigDecimal feesOwed;
    private BigDecimal feesPaid;
    private int currentSemester;

    public Student(int id, String studentName, String degreeOfStudy, double gpa, BigDecimal feesOwed, BigDecimal feesPaid, int currentSemester) {
        this.id = id;
        this.studentName = studentName;
        this.degreeOfStudy = degreeOfStudy;
        this.gpa = gpa;
        this.feesOwed = feesOwed;
        this.feesPaid = feesPaid;
        this.currentSemester = currentSemester;
    }

    public int getId() {
        return id;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getDegreeOfStudy() {
        return degreeOfStudy;
    }

    public double getGpa() {
        return gpa;
    }

    public BigDecimal getFeesOwed() {
        return feesOwed;
    }

    public BigDecimal getFeesPaid() {
        return feesPaid;
    }

    public int getCurrentSemester() {
        return currentSemester;
    }
}
