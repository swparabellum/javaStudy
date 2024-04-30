class Parent{
	int pa;
}

class Child extends Parent{
	int ch;
}

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		System.out.println(p instanceof Object);
		System.out.println(p instanceof Parent);
		System.out.println(p instanceof Child);
		System.out.println();
		
		Child c = new Child();
		System.out.println(c instanceof Object);
		System.out.println(c instanceof Parent);
		System.out.println(c instanceof Child);
	}

}
