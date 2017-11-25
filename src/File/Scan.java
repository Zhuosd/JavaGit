package File;

import java.util.Scanner;

public class Scan {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		while(scan.nextDouble()!=0){
			System.out.println("��������ֵ");
			if (scan.hasNextDouble()) {
				double score = scan.nextDouble();
				System.out.println("��ֵΪ" + score);
				flag = false;
			}else{
				System.out.println("�����������");
			}
		}
		scan.close();
	}
}
