import java.io.*;
import java.util.*;
import java.util.Random;
public class Person {

    String name;
    String surname;
    int age;
    boolean gender;
    Random random;
    int idperson;

    public Person(String name, String surname, int age, boolean gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    Person(){
        random = new Random();
    }
    void roll(){
        idperson = random.nextInt(900000)+1;

    }
    public String getIDpersoon() {
        return idperson+"";
    }

    @Override
    public String toString() {
        return "Hi, I am " + name + " " + surname + ", a " + age + "-year-old " + (gender ? "Male" : "Female") +  ".";
    }
}
