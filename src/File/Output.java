package File;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Output {
	public static void main(String[] args) throws Exception {
		//1������Ҫ����ļ���·��
		File file = new File("E:" + File.separator +"demo" +File.separator +  "my.txt");
		//2����ʱ����Ŀ¼�����ڣ������ļ����������Ӧ�����ȴ���Ŀ¼��
		if (!file.getParentFile().exists()) { //�ļ�Ŀ¼������
			file.getParentFile().mkdirs();	  //����Ŀ¼
		}
		//3��Ӧ��ʹ��OutputStream����������ж����ʵ��������ʱĿ¼�����ڣ��ļ�������
		OutputStream output = new FileOutputStream(file,true);
		//4��Ҫ�����ļ����ݵ����
		String str = "�ú�ѧϰ,��������!\r\n";
		byte data[] = str.getBytes();
/*		for (int x = 0; x < data.length; x++) {
			output.write(data[x]);
		}*/
		output.write(data, 2, 6);
		output.write(data);
		//5����Դ���������һ��Ҫ���йر�
		output.close();
	}
}
