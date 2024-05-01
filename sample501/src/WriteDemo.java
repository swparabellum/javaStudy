import java.io.FileWriter;

public class WriteDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String str = "³¢¿¡¿¡¿¡¿¡¿¡¿¡¿¢";
		char[] txt = new char[str.length()];
		
		str.getChars(0,str.length(),txt,0);
		FileWriter fw = new FileWriter("data1.txt");
		fw.write(txt);
		fw.close();
	}

}
