import java.util.ArrayList;

public class Student extends Person {
    private static int id = 1;
    private int studentID;
    ArrayList<Integer> grades;

    public Student(String name, String surname, int age, boolean gender, ArrayList<Integer> grades) {
        super(name, surname, age, gender);
        this.studentID =id++;
        this.grades = grades;
    }



    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double calculateGPA() {
        if (grades.size() == 0) {
            return 0;
        }
        double gpa = 0.0;
        for(int grade : grades) {
            if (grade < 50) gpa += 0.0;
            else if (grade < 55) gpa += 1.0;
            else if (grade < 60) gpa += 1.33;
            else if (grade < 65) gpa += 1.67;
            else if (grade < 70) gpa += 2.0;
            else if (grade < 75) gpa += 2.33;
            else if (grade < 80) gpa += 2.67;
            else if (grade < 85) gpa += 3.0;
            else if (grade < 90) gpa += 3.33;
            else if (grade < 95) gpa += 3.67;
            else if (grade <= 100) gpa += 4.0;
        }
        return gpa/grades.size();
    }

    public int getStudentID() {
        return studentID;
    }
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return super.toString() + " I am student " + studentID ;
    }
}
