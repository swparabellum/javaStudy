
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ch over = new Ch();
		over.show("�����ε�");
		over.Show();
	}

}

class Pa{
	void show(String str) {
		System.out.println("����Ŭ���� "+str);
	}
}

class Ch extends Pa{
	void Show() {
		System.out.println("����Ŭ����");
	}
}