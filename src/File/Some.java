package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Some {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("E:" + File.separator +"demo" + File.separator + "my.txt");
		if(!file.getParentFile().exists()){
			file.getParentFile().mkdirs();
		}
		OutputStream output = new FileOutputStream(file);
		Writer out = new OutputStreamWriter(output);
		out.write("Hello World!");
		out.flush();
		out.close(); 
	}

}
