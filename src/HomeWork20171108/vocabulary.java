package HomeWork20171108;

import java.io.*;

/**
 * 描述:
 * 因为单词
 *
 * @outhor 71948
 * @create 2017-11-10 20:25
 */
public class vocabulary {
    public static void main(String[] args) throws Exception {
        File file1 = new File("D:\\A.txt");
        BufferedReader reader = new BufferedReader(new FileReader((file1)));
        String temp = null;
        StringBuffer sb = new StringBuffer();
        while ((temp=reader.readLine())!=null){
            sb.append(temp);
        }
        String [] text = sb.toString().split(" " );
        for (String s : text) {
            System.out.println(s);
        }
        reader.close();
    }
}