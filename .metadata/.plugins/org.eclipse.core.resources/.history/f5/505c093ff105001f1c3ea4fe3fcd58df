
public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fo fo = new Fo(10,20,30);
		System.out.println(fo.i+", "+fo.j+", "+fo.k);
		fo.show();
	}

}

class Th{
	int i,j;
	Th(int a, int b){
		i=a; j=b;
	}
	void show() {
		System.out.println("상위 show");
	}
}
class Fo extends Th{
	int k;
	Fo(int a, int b, int c){
		super(a,b);
		k=c;
	}
	void show() {
		System.out.println("하위 show");
		super.show();
	}
}