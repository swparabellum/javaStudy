
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
interface C extends A, B {//2�� �������̽� ���
	void cmeth1();
}

class InterClass implements C{

	@Override
	public void ameth1() {
		// TODO Auto-generated method stub
		System.out.println("ameth1() ����");
	}

	@Override
	public void ameth2() {
		// TODO Auto-generated method stub
		System.out.println("ameth2() ����");
	}

	@Override
	public void bmeth() {
		// TODO Auto-generated method stub
		System.out.println("bmeth() ����");
	}

	@Override
	public void cmeth1() {
		// TODO Auto-generated method stub
		System.out.println("cmeth1() ����");
	}
	
}