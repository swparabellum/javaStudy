
class ThisTest{
	int x,y;
	
	public ThisTest() {
		this(10,10);
		}
	public ThisTest(int x) {
		this(x,10);
	}
	public ThisTest(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public void show() {
		System.out.println(x+", "+y);
	}
}

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisTest tt1 = new ThisTest(10,20);
		tt1.show();
		ThisTest tt2 = new ThisTest(30);
		tt2.show();
		ThisTest tt3 = new ThisTest();
		tt3.show();
		
	}

}
