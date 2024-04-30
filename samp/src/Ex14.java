
public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String은 불변 객체
		String s1 = "Java Korea";
		//직접 문자열을 지정(canonical 문자열)
		//단축 초기화로 객체 생성
		String s2 = new String("Java Korea"); //정식 객체생성
		String s3 = s2.intern();//canonical 문자열로 전환
		String s4 = "Java Korea";
		
		System.out.println("객체(주소)비교");
		System.out.println("S1 == S2 "+(s1==s2));
		System.out.println("S2 == S3 "+(s2==s3));
		System.out.println("S1 == S3 "+(s1==s3));
		System.out.println("S1 == S4 "+(s1==s4));
		System.out.println("객체가 참조하는 데이터 비교");
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		
	}

}
