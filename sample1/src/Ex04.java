
public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		B b = new B();
		C c = new C();
		if(a instanceof A) {
		System.out.println("a�� AŬ������ ��ü");	
		}
		if(b instanceof B) {
			System.out.println("b�� BŬ������ ��ü");	
		}
		if(c instanceof C) {
			System.out.println("c�� CŬ������ ��ü");	
		}
		if(c instanceof A) {
			System.out.println("c�� AŬ������ ��ü : ����ȯ");	
		}
		if(a instanceof C) {
			System.out.println("a�� CŬ������ ��ü : ����ȯ");	
		}else {
			System.out.println("a�� CŬ������ ��ü�� �ƴ�: ����ȯ �Ұ�");
		}
		
	}

}

class A{
	int a;
}
class B extends A{
	int b;
}
class C extends B{
	int c;
}