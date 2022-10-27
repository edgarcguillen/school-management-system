import java.io.File;
import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

public class School {


    /**
     * school can have many students and departments
     */
    private Map<String,Student> students = new TreeMap<>();
    private Map<String,Department> departments = new TreeMap<>();
    private BigDecimal totalEarnings;


    public School(Map<String, Student> students, Map<String, Department> departments) {
        this.students = students;
        this.departments = departments;
        this.totalEarnings = new BigDecimal(0);
    }

    // create map of -> department name : department details
    public Map<String,Department> mapOfDepartments(File file){
        
    }


}
