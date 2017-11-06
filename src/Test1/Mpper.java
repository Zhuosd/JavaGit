package Test1;

import java.util.HashMap;
import java.util.Map;

public class Mpper {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("一", 1);
		map.put("二", 2);
		map.put("三", 3);
		map.put(null, 0);
		System.out.println(map.get("一"));
		System.out.println(map.get("Liu"));
	}
}
