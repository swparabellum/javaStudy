import java.io.File;
import java.text.SimpleDateFormat;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String currDir = System.getProperty("user.dir");
		File dir = new File(currDir);
		File[] files = dir.listFiles();
		
		for(int i = 0; i< files.length; i++) {
			File f = files[i];
			String name = f.getName();
			SimpleDateFormat df = new SimpleDateFormat("yyy-MM-dd-a HH:mm");
			String attribute = "";
			String size = "";
			
			if(files[i].isDirectory()) {
				attribute = "DIR";
			}else {
				size = f.length() + "";
				attribute = f.canRead() ? "R":"*";
				attribute += f.canWrite()? "W":"*";
				attribute += f.isHidden()? "H":"*";
			}
			System.out.println(name);
			System.out.println(attribute+size+df.format(f.lastModified()));
		}
	}

}
