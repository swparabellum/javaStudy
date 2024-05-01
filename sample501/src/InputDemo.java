import java.io.FileInputStream;
import java.io.IOException;

public class InputDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("stream1.txt");
		
		int i;
		
		while((i=fis.read()) != -1) {
			System.out.print(i);
		}
		fis.close();
	}

}
