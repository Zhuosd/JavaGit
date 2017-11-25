package File;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class Write {

	public static void main(String[] args) throws Exception {
        File file = new File("e:" + File.separator + "demo" + File.separator
                + "my.txt");	
        //1������Ҫ�����ļ���·��
        if(file.getParentFile().exists()){
        	file.getParentFile().mkdirs();
        }
        //2��ʵ����Writer��Ķ���
        Writer out = new FileWriter(file);
        //�������
        String str = "�ۺ�֢";
        out.write(str);
        //�ر������
        out.close();
	}

}
