import java.util.Scanner;

public class Continue {
	public static void main(String[] args) {
		System.out.print("请输入需要进行阶乘的一个整数：");
		Scanner sca = new Scanner(System.in);
		int In = sca.nextInt();
		int sum =1;
		for (int i = 1; i <= In; i++) {
			sum = sum * i;
			if(i == In ) continue;
		}
	}
}
