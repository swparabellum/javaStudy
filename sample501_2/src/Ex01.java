import java.io.File;

public class Ex01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f = new File("C:\\dev\\work\\sample501_2\\exam.txt");
		String fileName = f.getName();
		int pos = fileName.lastIndexOf(".");
		
		System.out.println("파일이름 "+f.getName());
		System.out.println("확장자 "+fileName.substring(pos+1));
		System.out.println("절대경로 "+f.getAbsolutePath());
		System.out.println(File.separator);
	}

}
