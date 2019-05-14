package chapter_15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeMutable {
    public static void main(String[] args) {
        try (
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("mutable.txt"));
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("mutable.txt"))) {
            Person per = new Person("孙悟空", 500);
            oos.writeObject(per);
            per.setName("猪八戒");
            //系统只是输出序列化编号，所以改变后的name不会被序列化
            oos.writeObject(per);
            Person p1 = (Person)ois.readObject();
            Person p2 = (Person)ois.readObject();
            System.out.println(p1 == p2);
            System.out.println(p2.getName());
            System.out.println(per.getName());
        }catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
