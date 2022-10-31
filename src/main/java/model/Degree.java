package model;

import java.math.BigDecimal;

public class Degree {

    private String nameOfDegree;
    private int totalSemesters;
    private BigDecimal costOfDegree;

    public Degree(){};
    
    public Degree(String nameOfDegree, int totalSemesters, BigDecimal costOfDegree) {
        this.nameOfDegree = nameOfDegree;
        this.totalSemesters = totalSemesters;
        this.costOfDegree = costOfDegree;
    }




}
