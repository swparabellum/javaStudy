
public class Ex15 {

	public static void main(String[] args) {
		int a= -5, result;
		result = abs(a);
		System.out.println(result);
		System.out.println(abs(10));
		
	}

	private static int abs(int a) {
		// TODO Auto-generated method stub
		int y;
		if(a<0) {
			y= -a;
		}else {
			y= a;
		}
		return y;
	}

}
