
public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Two tw = new Two(10,20);
		System.out.println(tw.d1);
		System.out.println(tw.d2);
	}

}

class One{
	int d1, s;
	One(int s1){
		System.out.println("one 持失切");
		s = s1; 
		d1 = s*s;
	}
}

class Two extends One{

	int d2, t;
	Two(int s1, int t1){
		super(s1);
		System.out.println("Two 持失切");
		t = t1; d2=t*t;
	}
	
	
}