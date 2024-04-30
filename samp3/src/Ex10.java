import java.util.StringTokenizer;

public class Ex10 {
	static String s = "국적,한국,성명,홍길동,성별,논,주소,서울시";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StringTokenizer st1 = new StringTokenizer(s, ",");
		//문자열 분해 파싱.
		
		while(st1.hasMoreTokens()) {
			String first = st1.nextToken();
			String second = st1.nextToken();
			System.out.println(first+" \t "+second);
		}
	}

}
