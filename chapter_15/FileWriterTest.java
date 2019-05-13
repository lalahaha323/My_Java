package chapter_15;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        try (
            FileWriter fw = new FileWriter("poem.txt"))
        {
            fw.write("金色\n");
            fw.write("lala");
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
