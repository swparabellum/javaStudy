
public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxId box1 = new BoxId();
		BoxId box2 = new BoxId();
		BoxId box3 = new BoxId();
		BoxId box4 = new BoxId();
		
		System.out.println("Box1�� idnum: "+box1.idNum);
		System.out.println("Box2�� idnum: "+box2.idNum);
		System.out.println("Box3�� idnum: "+box3.idNum);
		System.out.println("Box4�� idnum: "+box4.idNum);
		System.out.println("�Ѱ��� "+BoxId.boxID);

	}

}

class BoxId{
	long idNum;
	static long boxID=0;
	public BoxId() {
		idNum= boxID++;
	}
}