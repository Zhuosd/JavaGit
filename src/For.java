import java.util.Scanner;

public class For {
	public static void main(String[] args) {
		System.out.print("请输入需要进行阶乘的一个整数：");
		Scanner sca = new Scanner(System.in);
		int In = sca.nextInt();
		int sum =1;
		for (int i = 1; i <= In; i++) {
			sum = sum * i;
		}
		System.out.println("阶乘的数值为：" + sum);
	}
}
