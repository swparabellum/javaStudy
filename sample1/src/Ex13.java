abstract class Shape2{
	public double res = 0;
	public abstract double area(); //�߻� �޼���
	public void printArea() {
		System.out.println("������ "+res);
	}
}
class Circle2 extends Shape2{
	public int r = 5;
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		res = r*r*Math.PI;
		return res;
	}
	
}

class Rect2 extends Shape2{
	public int w=10, h=10;
	
	@Override
	public double area() { //������
		// TODO Auto-generated method stub
		res = w*h;
		return res;
	}
}


public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape2 ref = null;
		ref = new Circle2(); //����ȯ(�ٿ�ĳ����)
		ref.area();
		ref.printArea();
		ref = new Rect2();
		ref.area();
		ref.printArea();
		//������
	}

}