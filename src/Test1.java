import java.util.Set;
import java.util.TreeSet;

public class Test1 {
	public static void main(String[] args) {
		Set<String> all = new TreeSet<String>();
		all.add("X");
		all.add("B");
		all.add("A");
		all.add("V");
		all.add("B");
		System.out.println(all);
	}
}
