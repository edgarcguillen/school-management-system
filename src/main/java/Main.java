import model.Degree;
import model.Menu;
import model.School;
import model.Student;

import java.io.File;
import java.util.Map;

public class Main {

    private final Menu menu = new Menu();
    private final Degree degree = new Degree();
    private final School school = new School();
    private final Student student = new Student();
    private File degreeFile = new File("degree-database.csv");
    private File schoolFile = new File("school-database.csv");

    public static void main(String[] args) {
        Main main = new Main();
        main.run();





    }

    private void run() {
        int menuSelection = -1;
        while (menuSelection != 0) {
            menu.printMainMenu();
            menuSelection = menu.promptForMenuSelection("Please choose an option: ");
            if (menuSelection == 1) {
                // list students
                handleListStudents();
                handleStudentSelection();
                // handle student selection
            } else if (menuSelection == 2) {
                // list school details
            } else if (menuSelection == 3) {
                // list degree details
            } else if (menuSelection == 0) {
                continue;
            } else {
                // anything else is not valid
                System.out.println("Invalid Selection");
            }
            menu.pause();
        }
    }


    private void handleListStudents() {
        // List all students
        Map<Integer,Student> students = student.mapOfStudents();
        if (!students.isEmpty()) {
            student.printListOfStudents(students);
            promptForStudentSelection();
        } else {
            System.out.println("Error printing student list");;
        }
    }

    private void promptForStudentSelection(){
        System.out.print(System.lineSeparator() + "Input student ID to learn read about the student's accomplishments: ");
    }



    //TODO put in student class
    private void handleStudentSelection(){

    }

}
