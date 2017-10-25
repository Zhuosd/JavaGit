class Singlon{
	private final static Singlon instance = new Singlon();
	private Singlon(){
		
	}
	public void print(){
		System.out.println("Hello World!");
	}
	public static Singlon getInstance(){
		return instance;
	}
}
public class TestDemo {
	public static void main(String[] args) {
		Singlon inst = Singlon.getInstance();
		inst.print();
	}
}
