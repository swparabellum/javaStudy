import java.util.HashMap;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("cat","1234");
		map.put("nice","9999");
		map.put("dog","5678");
		Scanner s = new Scanner(System.in); //키보드입력
		
		while(true) {
			System.out.println("로그인");
			System.out.println("아이디 = ");
			String id = s.nextLine().trim();
			System.out.println("비밀번호");
			String pw = s.nextLine().trim();
			
			if(!map.containsKey(id)) {
				System.out.println("아이디가 일치하지않음.");
			}else {
				if(!map.get(id).equals(pw)){
					System.out.println("비밀번호가 일치하지 않음.");
				}
				else {
					System.out.println(id+" 님 환영합니다.");
					break;
				}
			}
		}
	}

}
