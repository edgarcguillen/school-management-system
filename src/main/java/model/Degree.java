package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

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

    public Map<String, Degree> mapOfDegrees(File file){

        Map<String,Degree> map = new TreeMap<>();

        try (Scanner scanner = new Scanner(file)){
            while(scanner.hasNextLine()){
                String txtLine = scanner.nextLine();
                String[] txtArray = txtLine.split("|");

                if (txtArray[0].equals("Primatology")){
                    map.put(txtArray[0].toUpperCase(), new Degree(txtArray[0], Integer.getInteger(txtArray[1]), new BigDecimal(txtArray[2])));
                } else if (txtArray[0].equals("Chemistry")) {
                    map.put(txtArray[0].toUpperCase(), new Degree(txtArray[0], Integer.getInteger(txtArray[1]), new BigDecimal(txtArray[2])));
                } else if (txtArray[0].equals("Computer Science")) {
                    map.put(txtArray[0].toUpperCase(), new Degree(txtArray[0], Integer.getInteger(txtArray[1]), new BigDecimal(txtArray[2])));
                } else if (txtArray[0].equals("Biology")) {
                    map.put(txtArray[0].toUpperCase(), new Degree(txtArray[0], Integer.getInteger(txtArray[1]), new BigDecimal(txtArray[2])));
                } else if (txtArray[0].equals("Astrology")) {
                    map.put(txtArray[0].toUpperCase(), new Degree(txtArray[0], Integer.getInteger(txtArray[1]), new BigDecimal(txtArray[2])));
                } else if (txtArray[0].equals("Electrical Engineering")) {
                    map.put(txtArray[0].toUpperCase(), new Degree(txtArray[0], Integer.getInteger(txtArray[1]), new BigDecimal(txtArray[2])));
                } else if (txtArray[0].equals("Medicine")) {
                    map.put(txtArray[0].toUpperCase(), new Degree(txtArray[0], Integer.getInteger(txtArray[1]), new BigDecimal(txtArray[2])));
                } else if (txtArray[0].equals("Mathematics")) {
                    map.put(txtArray[0].toUpperCase(), new Degree(txtArray[0], Integer.getInteger(txtArray[1]), new BigDecimal(txtArray[2])));
                } else {
                    System.out.println(txtArray[0] + "model.Degree not found");
                }
            }
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        return map;
    }


    public String getNameOfDegree() {
        return nameOfDegree;
    }

    public int getTotalSemesters() {
        return totalSemesters;
    }

    public BigDecimal getCostOfDegree() {
        return costOfDegree;
    }
}
