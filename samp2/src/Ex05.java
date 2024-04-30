
public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point6 pt61 = new Point6();
		System.out.println(pt61.x+", "+pt61.y);
		
		Point6 pt62 = new Point6(300,400);
		System.out.println(pt62.x+", "+pt62.y);
	}

}

class Point6{
	int x,y;
	
	public Point6() {}
	public Point6(int x, int y) {
		this.x=x; this.y = y;
	}
	
	public void showPoint() {
		System.out.println(x+" , "+y);
	}
}
