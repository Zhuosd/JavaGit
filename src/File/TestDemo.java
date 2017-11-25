package File;
import java.io.File;

public class TestDemo {
    public static void main(String[] args) throws Exception { 	// �˴�ֱ���׳�
        File file = new File("d:\\test.txt"); 				// �����ļ���·��
        if (file.exists()) { 								// �ж��ļ��Ƿ����
           file.delete();								// ɾ���ļ�
        } else { 									// �ļ�������
           System.out.println(file.createNewFile());			// �������ļ�
        }
    }

}
