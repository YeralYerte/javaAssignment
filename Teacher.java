import java.util.ArrayList;
public class Teacher extends Person {
    String subject;
    int yearsOfExperience;
    int salary;

    public Teacher(String name, String surname, int age, boolean gender, String subject, int yearsOfExperience, int salary) {
        super(name, surname, age, gender);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }

    public void giveRaise(double percentage) {
        salary += salary * percentage / 100;
    }

    @Override
    public String toString() {
        return super.toString() + " I teach " + subject + ".";
    }

    class School {
        ArrayList<Person> members;

        public School() {
            this.members = new ArrayList<>();
        }

        public void addMember(Person person) {
            members.add(person);
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }
}



