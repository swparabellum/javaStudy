
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterClass ic = new InterClass();
		ic.ameth1();
		ic.ameth2();
		ic.bmeth();
		ic.cmeth1();
	}

}

interface A{
	void ameth1();
	void ameth2();
}
interface B{
	void bmeth();
}
interface C extends A, B {//2개 인터페이스 상속
	void cmeth1();
}

class InterClass implements C{

	@Override
	public void ameth1() {
		// TODO Auto-generated method stub
		System.out.println("ameth1() 구현");
	}

	@Override
	public void ameth2() {
		// TODO Auto-generated method stub
		System.out.println("ameth2() 구현");
	}

	@Override
	public void bmeth() {
		// TODO Auto-generated method stub
		System.out.println("bmeth() 구현");
	}

	@Override
	public void cmeth1() {
		// TODO Auto-generated method stub
		System.out.println("cmeth1() 구현");
	}
	
}