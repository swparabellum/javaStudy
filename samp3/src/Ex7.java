
public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a= new A();
		B b = new B();
		System.out.println(a);
		System.out.println(b);
		//toString() 정의시 자동호출 ( b.toString()과 동일)
	}

}

class A{
	int a=1, b=2;
	public A() {
		
	}
}

class B{
	int a=3, b=4;
	public String toString() { //Object 클래스
		return "필드=" +a+", "+ b;
	}
	
}
