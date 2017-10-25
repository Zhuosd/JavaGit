//定义不同的内部类的方式定义抽象类子类
abstract class A{	//定义一个抽象类
	public abstract void print();
	private static class B extends A{	//内部抽象类子类
		public void print(){	//覆写抽象类的方法
			System.out.println("使用机巧");
		}
	} 
	public static A getInstance(){
		return new B();	//此方法可以用个类名称直接调用
	}
}
public class Test {
	public static void main(String[] args) {
		//此时取得插像类对象时完全不需要知道B类这个子类存在
		A a = A.getInstance();
		a.print();	//调用被覆写的抽象方法
	}
}
