package File;
interface IM1{
	public void print();
	default void fun(){
		System.out.println("���������Ϊ");
	}
}
class IMessageImpl implements IM1{
	@Override
	public void print(){
		System.out.println("��Ҫ���ص�����Ϊ");
	}
}
public class Ordinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IM1 im = new IMessageImpl();
		im.fun();
		im.print();
	}
}
