
class C1{
	static int x;
	static int y;
}

class C2 extends C1{
	static String x;
}

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C2.x = "¾îÂ¼±¸ÀúÂ¼±¸ÀÚ¹Ù";
		C2.y=2000;
		C1.x = 3000;
		System.out.println("c2.x :" +C2.x);
		System.out.println("c2.y: "+C2.y);
		System.out.println("c1.x: "+C1.x);
	}

}
