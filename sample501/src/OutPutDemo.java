import java.io.FileOutputStream;
import java.io.IOException;

public class OutPutDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("stream1.txt");
		for(int i=0;i<20;i++) {
			fos.write(i);
		}
		fos.close();
	}

}
