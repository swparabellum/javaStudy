
class Pa2{
	void show() {
		System.out.println("상위 show");
		
	}
}

class Ch2 extends Pa2{
	void show() {
		System.out.println("하위 show");
	}
}

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ch2 ov = new Ch2();
		ov.show();
	}

}
