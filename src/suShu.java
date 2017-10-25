import java.util.Scanner;

public class suShu {
    public static void main(String args[]){
        System.out.println("请输入一个正整数");
        Scanner sca = new Scanner(System.in);
        int su = sca.nextInt();
        int i;
        for (i =2;i < su ;i++){
            if(su%i == 0)
                break;
        }
        if (i == su){
            System.out.print("这个数"+su+ "是素数");
        }else {
            System.out.print("这个数"+su+ "是素数");
        }
    }
}
