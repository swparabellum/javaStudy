import java.util.StringTokenizer;

public class Ex10 {
	static String s = "����,�ѱ�,����,ȫ�浿,����,��,�ּ�,�����";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StringTokenizer st1 = new StringTokenizer(s, ",");
		//���ڿ� ���� �Ľ�.
		
		while(st1.hasMoreTokens()) {
			String first = st1.nextToken();
			String second = st1.nextToken();
			System.out.println(first+" \t "+second);
		}
	}

}
