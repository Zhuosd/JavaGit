package File;


enum Color{
	RED,GREEN,BLUE;
}
public class Enum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (Color c:Color.values()) {
			System.out.println(c.ordinal() + "==" + c.name());
		}
	}

}
