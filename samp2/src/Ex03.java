
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overload ob = new overload();
		
		double result;
		
		ob.test();
		result =ob.test(100);
		System.out.println(result);
		result= ob.test(4.2);
		System.out.println(result);
		
	}

}

class overload{
	void test() {
		System.out.println("매개변수 없음.");
	}
	void test(int a, int b) {
		System.out.println("매개변수 int "+a+"와 int "+b);

	}
	double test(double b) {
		System.out.println("매개변수 double "+b);
		return b*2;
	}
}