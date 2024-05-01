import java.io.File;

public class Ex02 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		try {
			File f = new File("C:\\dev\\work\\sample501_2","exam.txt");
			System.out.println(f.getName());
			System.out.println(f.exists());
			System.out.println(f.getPath());
			System.out.println(f.getParent());
			boolean md = new File("C:\\dev\\work\\sample501_2\\temp").mkdir();
			
			String[] ls = new File("C:\\dev\\work\\sample501_2").list();
			for(String st:ls) {
				System.out.println(st);
			}
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
