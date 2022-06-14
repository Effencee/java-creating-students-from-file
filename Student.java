package z4;

import java.util.List;

public class Student {
    private String name;
    private String surname;
    private String email;
    private String index;
    private List<Double> notes;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", index='" + index + '\'' +
                ", notes=" + notes +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public List<Double> getNotes() {
        return notes;
    }

    public void setNotes(List<Double> notes) {
        this.notes = notes;
    }

    public Student(String name, String surname, String email, String index, List<Double> notes) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.index = index;
        this.notes = notes;
    }
}
