
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle ref = new Triangle();
		ref.setColor(Color.RED);
		switch(ref.getColor()) {
		case 1:
			System.out.println("������");
			break;
		case 2:
			System.out.println("green");
			break;
		case 3:
			System.out.println("blue");
			break;
		}
		System.out.println("�ﰢ��");
	}

}

interface Color{
	//public static final ���� ���ǻ��
	int RED = 1;
	int GREEN = 2;
	int BLUE = 3;
	//public abstract ����, �߻�޼���
	int getColor();
	void setColor(int c);
}

class Triangle implements Color{
	int color = 0;
	public int getColor() { //������
	return color;
	}
	public void setColor(int c) {//������
		color = c;
	}
}