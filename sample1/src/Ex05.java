
public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B2 bb = new B2();
		bb.x = "�ڹ� ���";
		
		System.out.println("bb.x : "+bb.x);
		
		B1 b1 = new B1();
		b1.x = 5000;
		System.out.println("b1.x :"+b1.x);
	}

}

class B1{
	int x;
}
class B2 extends B1{
	String x;
}
