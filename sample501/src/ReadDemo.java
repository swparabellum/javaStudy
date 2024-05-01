import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("test.txt");
		
		int i;
		while((i=fr.read()) != -1) {
			System.out.print((char) i);
		}fr.close();
	}

}
