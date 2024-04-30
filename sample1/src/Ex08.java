
public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ch3 su = new Ch3();
		su.write();
	}

}

class Pa3{
	int x = 1000;
	void display() {
		System.out.println("상위 display");
	}
}
class Ch3 extends Pa3{
	int x = 2000;
	void display() {
		System.out.println("하위display");
	}
	void write() {
		this.display();
		super.display();
		System.out.println("this.x: "+x);
		System.out.println("super.x: "+super.x);
	}
}
