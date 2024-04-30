
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ch over = new Ch();
		over.show("오버로딩");
		over.Show();
	}

}

class Pa{
	void show(String str) {
		System.out.println("상위클래스 "+str);
	}
}

class Ch extends Pa{
	void Show() {
		System.out.println("하위클래스");
	}
}