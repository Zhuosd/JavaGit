package day08;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;


/**
 * 描述:
 *生成一个html文件，输入幂次为2的表格
 * @outhor 71948
 * @create 2017-11-08 14:56
 */

public class hTML {
    public static void main(String[] args) throws Exception {
        File file = new File("d:" + File.separator +"demo.html" );
        if(file.exists()){
            InputStream input = new FileInputStream(file);
            byte data[] = new byte[1024];
            int foot = 0;
            int temp = 0;

        }
    }
}