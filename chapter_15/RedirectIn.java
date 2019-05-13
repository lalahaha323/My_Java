package chapter_15;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class RedirectIn {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("src/chapter_15/RedirectIn.java")) {
            System.setIn(fis);
            Scanner sc = new Scanner(System.in);
            //如果不加下面这一句，结果会默认空格，\n都是分隔符！！！
            sc.useDelimiter("\n");
            while(sc.hasNext()) {
                System.out.println("键盘输入的内容是：" + sc.next());
            }
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}
