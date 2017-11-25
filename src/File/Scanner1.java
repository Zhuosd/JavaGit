package File;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("��������ֵ");
		if (scan.hasNextDouble()) {
			double score = scan.nextDouble();
			System.out.println("��ֵΪ" + score);
		}else{
			System.out.println("���������ֵ����");
		}
		scan.close();
	}

}
