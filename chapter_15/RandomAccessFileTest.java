package chapter_15;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
    public static void main(String[] args) {
        try(RandomAccessFile raf = new RandomAccessFile("src/chapter_15/RandomAccessFileTest.java", "r")) {
            System.out.println("RandomAccessFile的文件指针的初始位置：" + raf.getFilePointer());
            raf.seek(300);
            byte[] bbuf = new byte[1024];
            int hasRead = 0;
            while((hasRead = raf.read(bbuf)) > 0) {
                System.out.print(new String(bbuf, 0, hasRead));
            }
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}
