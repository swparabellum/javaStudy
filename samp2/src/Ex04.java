
public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point5 pt5 = new Point5();
		
		pt5.showPoint();
	}

}

class Point5{
	int x,y;
	
	public Point5() {
		System.out.println("디톨트 생성자");
	}
	
	public void showPoint() {
		System.out.println(x+", "+y);
	}
}
