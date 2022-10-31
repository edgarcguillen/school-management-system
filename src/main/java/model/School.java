package model;

import model.Degree;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class School {


    /**
     * school can have many students and departments
     */
    private String schoolName;
    private String schoolHistory;
    private BigDecimal totalOwed;
    private BigDecimal totalEarnings;

    public School(String schoolName, String schoolHistory, BigDecimal totalOwed, BigDecimal totalEarnings) {
        this.schoolName = schoolName;
        this.schoolHistory = schoolHistory;
        this.totalOwed = totalOwed;
        this.totalEarnings = totalEarnings;
    }

    public School(){};

    // create map of -> department name : department details
    // will pass in department-database file

    /**
     *
     * @param file is File
     * @return Map of Degrees
     */
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



}
