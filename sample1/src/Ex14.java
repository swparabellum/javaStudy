//�������̽��� ����(final)����� �߻�޼ҵ常 ���� �� ����.
interface Draw1{ //��ü�����Ұ�
	public abstract void draw();
}
class Oval1 implements Draw1{
	public void draw() { //������
		 System.out.println("���� �׸���");
	}
}

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Draw1 ref;
		ref = new Oval1(); //����ȯ(�ٿ�ĳ����)
		ref.draw();
	}

}
