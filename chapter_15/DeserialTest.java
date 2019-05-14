package chapter_15;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserialTest {
    private static final long serialVersionUID = 1L;
    public static void main(String[] arsg) throws IOException ,ClassNotFoundException{
        FileInputStream fis = new FileInputStream("Person.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Person person = (Person)ois.readObject();
        ois.close();
        System.out.println("Person Deserial" + person);
    }
}
