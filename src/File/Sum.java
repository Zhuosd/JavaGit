package File;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("������Ҫ��֤�����֣�");
		int date = scan.nextInt();
		if (date % 3 == 0 && date % 5 ==0 && date % 7 ==0 ){
			System.out.println(date + "����ͬʱ��3��5��7ʹ��");			
		}else{
			System.out.println(date + "�����Ա�ͬʱʹ��");
		}
	}
}
