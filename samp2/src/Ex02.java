
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prn(10,20,30); //메소드 오버로드(중복정의)
		prn(40,50);
		prn(60);
	}

	private static void prn(int i) {
		// TODO Auto-generated method stub
		System.out.println(i);
	}

	private static void prn(int i, int j, int k) {
		// TODO Auto-generated method stub
		System.out.println(i+", "+j+", "+k);
	}
	
	static void prn(int i, int j) {
		System.out.println(i+", "+j);
	}

}
