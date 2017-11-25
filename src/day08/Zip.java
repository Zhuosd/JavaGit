package day08;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * 描述:
 * 对文件进行压缩操作
 *
 * @outhor 71948
 * @create 2017-11-08 13:44
 */
public class Zip {
    public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream("D:/Hello.txt");
        GZIPOutputStream out = new GZIPOutputStream(new FileOutputStream(("D:/test.zip")));
        System.out.println("Writing...");
        int c;
        while((c=in.read()) != -1) out.write(c);
        in.close();
        out.close();
        System.out.println("Reading...");
        BufferedReader in2 = new BufferedReader(
                new InputStreamReader(new GZIPInputStream(new FileInputStream("D:/test.zip")))
        );
        String s;
        while((s = in2.readLine())!=null) System.out.println(s);
        in2.close();

        System.out.println("writing...");
        GZIPInputStream int3 = new GZIPInputStream(new FileInputStream("D:/test.zip"));
        FileOutputStream out2 = new FileOutputStream("d:/newhello.txt");
        while((c = int3.read())!=-1) out2.write(c);
        out2.close();
    }

}