import java.io.File;

public class Ex01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f = new File("C:\\dev\\work\\sample501_2\\exam.txt");
		String fileName = f.getName();
		int pos = fileName.lastIndexOf(".");
		
		System.out.println("�����̸� "+f.getName());
		System.out.println("Ȯ���� "+fileName.substring(pos+1));
		System.out.println("������ "+f.getAbsolutePath());
		System.out.println(File.separator);
	}

}
