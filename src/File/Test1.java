package File;
interface Fruit{
	public void eat();
	}

class apple implements Fruit{
	@Override
	public void eat(){
		System.out.println("ƻ��");
	}
}

class orange implements Fruit{
	@Override
	public void eat(){
		System.out.println("����");
	}	
}

class Factory{
	public static Fruit getInstance(String className){
		Fruit f = null;
		try {
			f = (Fruit)Class.forName(className).newInstance();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return f;
	}
	
}
public class Test1 {
	public static void main(String[] args) throws Exception {
		Fruit fa = Factory.getInstance("test");
		Fruit fb = Factory.getInstance("orange");
//		fb.eat();
//		fa.eat();
//		fb.eat();��
}
}
