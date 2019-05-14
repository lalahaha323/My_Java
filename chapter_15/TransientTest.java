package chapter_15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TransientTest {
    public static void main(String[] args) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("transient.txt"));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("transient.txt"))) {
            Person1 per = new Person1("孙悟空", 500);
            oos.writeObject(per);
            System.out.println("反序列化之前" + per.getName() + ": " + per.getAge());
            Person1 p = (Person1)ois.readObject();
            System.out.println("反序列化之后" + p.getName() + ": " + p.getAge());
        }catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
