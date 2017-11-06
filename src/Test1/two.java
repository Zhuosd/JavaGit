package Test1;

class BOOK {
	private String title;
	private double price;
	
	public BOOK() {//无参构造方法
		super();
	}

	public BOOK(String title, double price) {//有参构造方法
		super();
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	public void getInfo() {
		// TODO Auto-generated method stub
		System.out.println("图书" + this.getTitle() + "价格" + this.getPrice());
	}
	
}
public class two {
	public static void main(String[] args) {
		BOOK b = new BOOK("tushu",12.22);
		b.getInfo();
	}
}
