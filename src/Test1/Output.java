package Test1;

import java.io.*;

/**
 * 描述:
 *
 * @outhor 71948
 * @create 2017-10-25 22:28
 */
    public class Output {
        public static void main(String[] args) throws IOException {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\copy.jpg"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\copy2.jpg"));
            /*int b;
            while((b = bis.read()) != -1) {
                bos.write(b ^ 123);
            }*/

            // 读取和写入信息
            int len = 0;
            // 创建一个字节数组，当做缓冲区
            byte[] b = new byte[1024];
            while ((len = bis.read(b)) != -1) {
                bos.write(b, 0, len);
            }

            bis.close();
            bos.close();
        }
    }
