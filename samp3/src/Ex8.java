import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String input = "";
		
		do {
			System.out.println("�Է� Q�� ����.");
			input=scan.nextLine();
			System.out.println(input);
		}while(!input.equalsIgnoreCase("Q"));
		System.out.println("����");
		
	}
}
