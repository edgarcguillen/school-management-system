import java.math.BigDecimal;

/**
 * This class is responsible for keeping
 * track of students
 */
public class Student {

    private int id;
    private String studentName;
    private String majorName;
    private double gpa;
    private BigDecimal feesOwed;
    private BigDecimal feesPaid;
    private int currentSemester;

    public Student(int id, String studentName, String majorName, double gpa, BigDecimal feesOwed, BigDecimal feesPayed, int currentSemester) {
        this.id = id;
        this.studentName = studentName;
        this.majorName = majorName;
        this.gpa = gpa;
        this.feesOwed = feesOwed;
        this.feesPaid = new BigDecimal(0);
        this.currentSemester = currentSemester;
    }

    public int getId() {
        return id;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getMajorName() {
        return majorName;
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


    // used to update grade of student
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // used to update fees payed
    public void setFeesOwed(BigDecimal feesPaid){
        feesOwed = feesOwed.subtract(feesPaid);
    }

}
