
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle ref = new rectangle();
		ref.area();
		ref.printArea();
		ref.draw();
	}

}
interface Draw{
	
	public abstract void draw();
}

abstract class shap{
	public double res = 0;
	public abstract double area();
	public void printArea() {
		System.out.println("면적은 "+res);
	}
}
class rectangle extends shap implements Draw{
	public int w = 10, h = 10;

	@Override
	public double area() {
		// TODO Auto-generated method stub
		res = w* h;
		return res;
	}
	public void draw() {
		System.out.println("사각형을 그리다");
	}
	
}