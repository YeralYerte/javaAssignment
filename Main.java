import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        School school = new School();

        // Reading and creating Student objects
        File studentFile = new File("students.txt");
        if (studentFile.exists() && studentFile.canRead()) {
            try (BufferedReader br = new BufferedReader(new FileReader(studentFile))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] data = line.split(" ");
                    if (data.length >= 4) {
                        String name = data[0];
                        String surname = data[1];
                        int age = Integer.parseInt(data[2]);
                        boolean gender = data[3].equalsIgnoreCase("Male");
                        List<Integer> grades = new ArrayList<>();
                        for (int i = 4; i < data.length; i++) {
                            grades.add(Integer.parseInt(data[i]));
                        }
                        school.addMember(new Student(name, surname, age, gender, (ArrayList<Integer>) grades));
                    }
                }
            }
        }

        File teacherFile = new File("teachers.txt");
        if (teacherFile.exists() && teacherFile.canRead()) {
            try (BufferedReader br = new BufferedReader(new FileReader(teacherFile))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] data = line.split(" ");
                    if (data.length >= 7) {
                        String name = data[0];
                        String surname = data[1];
                        int age = Integer.parseInt(data[2]);
                        boolean gender = data[3].equalsIgnoreCase("Male");
                        String subject = data[4];
                        int yearsOfExperience = Integer.parseInt(data[5]);
                        int salary = Integer.parseInt(data[6]);
                        school.addMember(new Teacher(name, surname, age, gender, subject, yearsOfExperience, salary));
                    }
                }
            }
        }

        System.out.println(school.toString());
        for (Person member : school.members) {
            if (member instanceof Teacher) {
                Teacher teacher = (Teacher) member;
                if (teacher.yearsOfExperience > 10) {
                    teacher.giveRaise(10); // 10% raise
                }
            }
        }
        System.out.println(school.toString());
    }
}


