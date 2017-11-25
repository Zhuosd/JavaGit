package File;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
public class Input {
    public static void main(String[] args) throws Exception { // ֱ���׳�
        File file = new File("e:" + File.separator + "demo" + File.separator
              + "my.txt");						// 1������Ҫ����ļ���·��
        if (file.exists()) {	// ��Ҫ�ж��ļ��Ƿ���ں�ſ��Խ��ж�ȡ
           // 2��ʹ��InputStream���ж�ȡ
           InputStream input = new FileInputStream(file) ;
           byte data [] = new byte [1024] ;				// ׼����һ��1024������
        //   int len = input.read(data) ;					// 3���������ݶ�ȡ�������ݱ��浽�ֽ�������
           int foot = 0;
           int temp = 0;
           while((temp = input.read())!=-1){
        	   data[foot++]  = (byte)temp;
           }
           input.close();							// 4���ر�������
           // ����ȡ�������ֽ��������ݱ�Ϊ�ַ����������
           System.out.println("��" + new String(data,0,foot) + "��");
        }
    }
}
