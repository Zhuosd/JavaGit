package File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScanFile {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(new FileInputStream(new File("E:"+File.separator + "demo" + File.separator + "my.txt")));
		scan.useDelimiter("\n");
		while(scan.hasNext()){
			System.out.println(scan.next());
		}
		scan.close();
	}
}
