//인터페이스는 정의(final)상수와 추상메소드만 가질 수 있음.
interface Draw1{ //객체생성불가
	public abstract void draw();
}
class Oval1 implements Draw1{
	public void draw() { //재정의
		 System.out.println("원을 그리다");
	}
}

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Draw1 ref;
		ref = new Oval1(); //형변환(다운캐스팅)
		ref.draw();
	}

}
