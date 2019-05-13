package chapter_15;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringNodeTest {
    public static void main(String[] args) {
        String src = "从明天起，我要做一个幸福的人\n"
                + "为嘛？\n"
                +"因为我想要幸福\n";
        char[] buffer = new char[32];
        int hasRead = 0;
        try(StringReader sr = new StringReader(src)) {
            while((hasRead = sr.read(buffer)) > 0) {
                System.out.print(new String(buffer, 0, hasRead));
            }
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
        try(StringWriter sw = new StringWriter(20)) {
            sw.write("有一个美丽的地方啊\n");
            System.out.println(sw.toString());
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}
