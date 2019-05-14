package chapter_15;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    public int id;
    public Person(int id, String name) {
        this.name = name;
        this.id = id;
    }
    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return "Person:" + id + ",name:" + name + ",age:" + age;
    }
}
