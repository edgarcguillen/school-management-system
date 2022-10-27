import java.math.BigDecimal;

public class Department {

    private String degreeName;
    private int degreeLength;
    private BigDecimal cost;
    private int totalSemesters;
    private BigDecimal totalTuitionEarned;


    public Department(String degreeName, int degreeLength, BigDecimal cost,BigDecimal totalTuitionEarned, int totalSemesters) {
        this.degreeName = degreeName;
        this.degreeLength = degreeLength;
        this.cost = new BigDecimal(150000);
        this.totalTuitionEarned = totalTuitionEarned;
        this.totalSemesters = totalSemesters;
    }



}
