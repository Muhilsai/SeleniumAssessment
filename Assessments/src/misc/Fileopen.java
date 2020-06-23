package misc;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileopen {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String a= "Hello World";
		FileOutputStream f= new FileOutputStream("C:\\Niraimathi\\ManipalSDET\\API\\Data\\File1.Json");
		f.write(a.getBytes());
		f.close();

	}

}
