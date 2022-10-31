package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * This class is responsible for keeping
 * track of students
 */
public class Student {

    private int id;
    private String studentName;
    private String degreeOfStudy;
    String studentAccomplishments;
    private BigDecimal feesOwed;

    public Student(int id, String studentName, String degreeOfStudy, String studentAccomplishments, BigDecimal feesOwed) {
        this.id = id;
        this.studentName = studentName;
        this.degreeOfStudy = degreeOfStudy;
        this.studentAccomplishments = studentAccomplishments;
        this.feesOwed = new BigDecimal(50000);
    }

    public Student(String studentName, String degreeOfStudy,String studentAccomplishments, BigDecimal feesOwed) {
        this.studentName = studentName;
        this.degreeOfStudy = degreeOfStudy;
        this.studentAccomplishments = studentAccomplishments;
        this.feesOwed = new BigDecimal(50000);
    }

    public Student(){};


    /**
     * @return map of Students
     */
    public Map<Integer, Student> mapOfStudents(){

        Map<Integer,Student> mapOfStudents = new TreeMap<>();

        File studentFile = new File("C:\\Users\\Student\\workspace\\side-projects\\school-management-system\\student-database.csv");

        try (Scanner scanner = new Scanner(studentFile)){
            while(scanner.hasNextLine()){
                String txtLine = scanner.nextLine();
                String[] txtArray = txtLine.split("\\|");

                if (txtArray[0].equals("1111")){
                    mapOfStudents.put(Integer.valueOf(txtArray[0]),new Student(Integer.valueOf(txtArray[0]),txtArray[1],txtArray[2],txtArray[3],getFeesOwed()));
                } else if (txtArray[0].equals("1112")) {
                    mapOfStudents.put(Integer.valueOf(txtArray[0]),new Student(Integer.valueOf(txtArray[0]),txtArray[1],txtArray[2],txtArray[3],getFeesOwed()));
                } else if (txtArray[0].equals("1113")) {
                    mapOfStudents.put(Integer.valueOf(txtArray[0]),new Student(Integer.valueOf(txtArray[0]),txtArray[1],txtArray[2],txtArray[3],getFeesOwed()));
                } else if (txtArray[0].equals("1121")) {
                    mapOfStudents.put(Integer.valueOf(txtArray[0]),new Student(Integer.valueOf(txtArray[0]),txtArray[1],txtArray[2],txtArray[3],getFeesOwed()));
                } else if (txtArray[0].equals("1122")) {
                    mapOfStudents.put(Integer.valueOf(txtArray[0]),new Student(Integer.valueOf(txtArray[0]),txtArray[1],txtArray[2],txtArray[3],getFeesOwed()));
                } else if (txtArray[0].equals("1123")) {
                    mapOfStudents.put(Integer.valueOf(txtArray[0]),new Student(Integer.valueOf(txtArray[0]),txtArray[1],txtArray[2],txtArray[3],getFeesOwed()));
                } else if (txtArray[0].equals("1211")) {
                    mapOfStudents.put(Integer.valueOf(txtArray[0]),new Student(Integer.valueOf(txtArray[0]),txtArray[1],txtArray[2],txtArray[3],getFeesOwed()));
                } else if (txtArray[0].equals("1222")) {
                    mapOfStudents.put(Integer.valueOf(txtArray[0]),new Student(Integer.valueOf(txtArray[0]),txtArray[1],txtArray[2],txtArray[3],getFeesOwed()));
                } else if (txtArray[0].equals("1233")) {
                    mapOfStudents.put(Integer.valueOf(txtArray[0]),new Student(Integer.valueOf(txtArray[0]),txtArray[1],txtArray[2],txtArray[3],getFeesOwed()));
                } else if (txtArray[0].equals("2111")) {
                    mapOfStudents.put(Integer.valueOf(txtArray[0]),new Student(Integer.valueOf(txtArray[0]),txtArray[1],txtArray[2],txtArray[3],getFeesOwed()));
                } else if (txtArray[0].equals("2222")) {
                    mapOfStudents.put(Integer.valueOf(txtArray[0]),new Student(Integer.valueOf(txtArray[0]),txtArray[1],txtArray[2],txtArray[3],getFeesOwed()));
                } else if (txtArray[0].equals("2333")) {
                    mapOfStudents.put(Integer.valueOf(txtArray[0]),new Student(Integer.valueOf(txtArray[0]),txtArray[1],txtArray[2],txtArray[3],getFeesOwed()));
                } else {
                    System.out.println(txtArray[0] + "Student not found");
                }
            }
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        return mapOfStudents;
    }


    /**
     * @return list of Students
     */
    public String printListOfStudents(Map<Integer,Student> map) {

        String returnString = "";
        for(Map.Entry<Integer, Student> item : map.entrySet()){
            System.out.println(item.getValue().toString() + "\n");
        }
        return returnString.trim();
    }

    @Override
    public String toString() {
        return String.format(
                        "Student ID: %s\n" +
                        "Name: %s\n" +
                        "Degree of Study: %s\n" +
                        "Academic Accomplishments: %s\n" +
                        "Tuition Fees Owed: %s", id, studentName,degreeOfStudy,studentAccomplishments,feesOwed);
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

    public BigDecimal getFeesOwed() {
        return feesOwed;
    }

}
