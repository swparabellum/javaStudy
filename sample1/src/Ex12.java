abstract class shape1{ //�߻� Ŭ����, ��ü ���� �Ұ���.
	public abstract void draw();// �߻� �޼��� ����
}

class circle1 extends shape1{
	
	@Override
	public void draw() {// ������
		System.out.println("���� �׸���.");
	}
}

/*
 * �������̵�, ������: �θ�Ŭ�������� �̹� ���ǵ� �޼ҵ带 
 * �ڽ� Ŭ�������� ���� �ñ״�ó�� ���� �޼ҵ�� �ٽ� ����
 */
public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape1 ref;
		ref = new circle1();
		ref.draw();
	}

}