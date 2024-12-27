import java.util.ArrayList;

public class School {
    ArrayList<Person> members;

    public School() {
        this.members = new ArrayList<>();
    }

    public void addMember(Person person) {
        members.add(person);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("School Members:\n");
        for (Person person : members) {
            result.append(person.toString()).append("\n");
        }
        return result.toString();
    }
}
