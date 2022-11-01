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

    public School() {
    };


    /**
     * @return map of School
     */
    public Map<String, School> mapOfSchool() {

        Map<String, School> mapofSchool = new TreeMap<>();

        File schoolFile = new File("C:\\Users\\Student\\workspace\\side-projects\\school-management-system\\school-database.csv");

        try (Scanner scanner = new Scanner(schoolFile)) {
            while (scanner.hasNextLine()) {
                String txtLine = scanner.nextLine();
                String[] txtArray = txtLine.split("\\|");

                if (txtArray[0].equals("The School of the Great")) {
                    mapofSchool.put(txtArray[0], new School(txtArray[0], txtArray[1], new BigDecimal(txtArray[2]), new BigDecimal(txtArray[3])));
                } else {
                    System.out.println(txtArray[0] + "School not found");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return mapofSchool;
    }


    /**
     * @return list of Students
     */
    public String printSchoolDetails(Map<String, School> map) {

        String returnString = "";
        for (Map.Entry<String, School> item : map.entrySet()) {
            System.out.println(item.getValue().toString() + "\n");
        }
        return returnString.trim();
    }

    public BigDecimal getTotalOwed() {
        return totalOwed;
    }

    public BigDecimal getTotalEarnings() {

        return totalEarnings;
    }

    @Override
    public String toString() {
        return String.format(
                "Student Name: %s\n" +
                        "History: %s\n" +
                        "Total Debt: %s\n" +
                        "Total Tuition Earnings: %s\n", schoolName, schoolHistory,getTotalOwed(), getTotalEarnings());
    }


}
