package chapter_15;

import java.io.*;

public class InsertContent {
    public static void insert(String fileName, long pos, String insertContent) throws IOException {
        File tmp = File.createTempFile("tmp", null);
        tmp.deleteOnExit();
        try(
                RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
                FileOutputStream tmpOut = new FileOutputStream(tmp);
                FileInputStream tmpIn = new FileInputStream(tmp)) {
            raf.seek(pos);
            //将插入点后的内容读入到临时文件中保存
            byte[] bbuf = new byte[64];
            int hasRead = 0;
            while((hasRead = raf.read(bbuf)) > 0) {
                tmpOut.write(bbuf, 0, hasRead);
            }
            //下面将插入内容
            raf.seek(pos);
            raf.write(insertContent.getBytes());
            while((hasRead = tmpIn.read(bbuf)) > 0) {
                raf.write(bbuf, 0, hasRead);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        insert("src/chapter_15/InsertContent.java", 45, "插入的内容\n");
    }
}
