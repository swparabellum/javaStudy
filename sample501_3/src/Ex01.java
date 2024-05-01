import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		URL url =null;
		BufferedReader input = null;
		String addr ="https://www.naver.com/index.html";
		String line = "";
		try {
			url = new URL(addr); 
				input = new BufferedReader(
						new InputStreamReader(url.openStream()));
				while((line=input.readLine())!= null) { //파일의 끝을 만날때까지..
					System.out.println(line);
				}
				input.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
