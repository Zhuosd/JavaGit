package File;

interface I{
	public void print();
}
public class Anonymous {

	public static void main(String[] args) {
		// �˴�ΪLambda���ʽ��û���κ����������ֻ�ǽ����������
		fun(()->System.out.println("ֻ����Ϊ��������������"));
	}
	public static void fun(I msg){
		msg.print();
	}

}
