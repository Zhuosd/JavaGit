package HomeWork20171108;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 描述:
 * 编写二进制文件复制的程序
 *
 * @outhor 71948
 * @create 2017-11-08 16:23
 */
public class File1 {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInput = new FileInputStream(new File("D:/test.txt"));
        FileOutputStream fileOut = new FileOutputStream("D:/test1.txt");

        int c;
        while((c=fileInput.read())!=-1)
            System.out.println(c);

        fileInput.close();
        fileOut.close();
    }
}