import java.util.Arrays;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str1 = new StringBuffer("�ȳ� �ڹ�"); //���ڿ� ���� + 15
		System.out.println("���� ���� "+str1);
		System.out.println("���� ũ�� "+str1.length());
		System.out.println("���� �뷮 "+str1.capacity());
		
		System.out.println("�ڷ� �߰�"+str1.append(" ���ڿ�"));
		System.out.println("���� �ֱ�"+str1.insert(3, " power "));
		System.out.println("4�� idx�� ����"+str1.charAt(4));
		str1.setCharAt(0, '��');
		System.out.println("0�� �ε����� ���� ������ ����. " +str1);
		
		str1.setLength(8); //���ڿ� ���̸� 8�� ���� �������� �ս�.
		System.out.println("���� ���� "+str1);
		System.out.println("���� ũ�� "+str1.length());
		System.out.println("���� �뷮 "+str1.capacity());
		System.out.println("���ڿ� ���� ��� "+str1.reverse());
		
	}
	

}
