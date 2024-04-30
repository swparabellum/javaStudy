abstract class shape1{ //추상 클래스, 객체 생성 불가능.
	public abstract void draw();// 추상 메서드 선언
}

class circle1 extends shape1{
	
	@Override
	public void draw() {// 재정의
		System.out.println("원을 그리다.");
	}
}

/*
 * 오버라이드, 재정의: 부모클래스에서 이미 정의된 메소드를 
 * 자식 클래스에서 같은 시그니처를 갖는 메소드로 다시 정의
 */
public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape1 ref;
		ref = new circle1();
		ref.draw();
	}

}
