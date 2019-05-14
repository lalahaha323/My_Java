package chapter_15;

import java.io.Serializable;

public class Teacher implements Serializable {
    //private static final long serivalVersionUID = 1L;
    private String name;
    private Person student;
    public Teacher(String name, Person student) {
        this.name = name;
        this.student = student;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setStudent(Person student) {
        this.student = student;
    }
    public String getName() {
        return this.name;
    }
    public Person getStudent() {
        return this.student;
    }
}
