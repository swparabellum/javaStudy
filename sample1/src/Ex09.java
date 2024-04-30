class AA1{
	double d1;
	AA1(){
		System.out.println("AA1持失切");
		d1 = 10*10;
	}
}

class AA2 extends AA1{
	double d2;
	AA2(){
		System.out.println("AA2持失切");
		d2 = 10*10*10;
	}
}
class AA3 extends AA2{
	double d3;
	AA3(){
		System.out.println("AA3持失切");
		d3= 10*10*10*10;
	}
}

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA3 sup = new AA3();
		System.out.println(sup.d1);
		System.out.println(sup.d2);
		System.out.println(sup.d3);
	}

}
