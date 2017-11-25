package File;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Read {
	public static void main(String[] args) throws Exception {
		File file = new File("E:" + File.separator +"demo" + File.separator + "my.txt");
		if(file.exists()){
			Reader in = new FileReader(file);
			char data [] = new char [1024];
			int len = in.read(data);
			in.close();
			System.out.println(new String(data,0,len));
		}
		
		
	}
	
}
