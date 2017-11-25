package File;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        int max = 50;
        int min = 49;
        Random random = new Random();
        int s = random.nextInt(2) + min;
        //Ĭ����СֵΪ0
        //����һ��min��ԭ����ȷ��Ҫ��������ķ�ΧΪ����(max-min)
        System.out.println(s);
    }
}