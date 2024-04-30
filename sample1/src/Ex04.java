
public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		B b = new B();
		C c = new C();
		if(a instanceof A) {
		System.out.println("a는 A클래스의 객체");	
		}
		if(b instanceof B) {
			System.out.println("b는 B클래스의 객체");	
		}
		if(c instanceof C) {
			System.out.println("c는 C클래스의 객체");	
		}
		if(c instanceof A) {
			System.out.println("c는 A클래스의 객체 : 형변환");	
		}
		if(a instanceof C) {
			System.out.println("a는 C클래스의 객체 : 형변환");	
		}else {
			System.out.println("a는 C클래스의 객체가 아님: 형변환 불가");
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