
public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String�� �Һ� ��ü
		String s1 = "Java Korea";
		//���� ���ڿ��� ����(canonical ���ڿ�)
		//���� �ʱ�ȭ�� ��ü ����
		String s2 = new String("Java Korea"); //���� ��ü����
		String s3 = s2.intern();//canonical ���ڿ��� ��ȯ
		String s4 = "Java Korea";
		
		System.out.println("��ü(�ּ�)��");
		System.out.println("S1 == S2 "+(s1==s2));
		System.out.println("S2 == S3 "+(s2==s3));
		System.out.println("S1 == S3 "+(s1==s3));
		System.out.println("S1 == S4 "+(s1==s4));
		System.out.println("��ü�� �����ϴ� ������ ��");
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		
	}

}
