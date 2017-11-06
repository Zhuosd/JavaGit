package Test1;

import java.util.Scanner;

public class GuShi {
    public static void main(String args[]){
        Scanner sca = new Scanner(System.in);
        int fenshu;
        do {
            System.out.println("请输入你所考取的分数：");
            fenshu = sca.nextInt();
        } while (fenshu != 100);
        System.out.println("恭喜，得到变形金刚");
    }
}
