import java.util.HashMap;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("cat","1234");
		map.put("nice","9999");
		map.put("dog","5678");
		Scanner s = new Scanner(System.in); //Ű�����Է�
		
		while(true) {
			System.out.println("�α���");
			System.out.println("���̵� = ");
			String id = s.nextLine().trim();
			System.out.println("��й�ȣ");
			String pw = s.nextLine().trim();
			
			if(!map.containsKey(id)) {
				System.out.println("���̵� ��ġ��������.");
			}else {
				if(!map.get(id).equals(pw)){
					System.out.println("��й�ȣ�� ��ġ���� ����.");
				}
				else {
					System.out.println(id+" �� ȯ���մϴ�.");
					break;
				}
			}
		}
	}

}
